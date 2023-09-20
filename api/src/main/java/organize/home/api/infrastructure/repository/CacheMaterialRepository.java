package organize.home.api.infrastructure.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import organize.home.api.application.interfaces.IMaterialCacheRepository;
import organize.home.api.domain.entities.CacheData;
import organize.home.api.domain.entities.Material;

@Repository
public class CacheMaterialRepository implements IMaterialCacheRepository
{
    public static final String HASH_KEY = "MATERIAL";

    private RedisTemplate<String, Material> template;
    private HashOperations hashOperations;
    
    @Autowired
    public CacheMaterialRepository(RedisTemplate<String, Material> template) {
        this.template = template;
        hashOperations = template.opsForHash();
    }

    @Override
    public Material save(Material material) {
        hashOperations.put(HASH_KEY, material.getId(), material);
        return material;
    }

    @Override
    public Map<String, Material> findAll() {
       return hashOperations.entries(HASH_KEY);
    }

    @Override
    public int quantityList() {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(0, hashOperations.entries(HASH_KEY));
        return hash_map.size();
    }
    
}
