package organize.home.api.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import organize.home.api.application.interfaces.IMaterialCacheRepository;
import organize.home.api.domain.entities.CacheData;
import organize.home.api.domain.entities.Material;

import java.util.*;
import java.util.concurrent.TimeUnit;

@Repository
public class CacheMaterialRepository implements IMaterialCacheRepository
{
    public static final String HASH_KEY = "CacheData";
    public static final Integer TIMETOLIVE = 10;

    @Autowired
    private RedisTemplate<String, CacheData> template;
    
    public CacheMaterialRepository(RedisTemplate<String, CacheData> template) {
        this.template = template;
    }

    @Override
    public void save(CacheData cacheData, List<Material> materials) {
        template.opsForHash().put(HASH_KEY, cacheData.getId(), materials);
        expireKey();   
    }

    public void expireKey()  {
        template.expire(HASH_KEY, TIMETOLIVE, TimeUnit.SECONDS);
    }

    @Override
    public List<Object> findAll() {
       return template.opsForHash().values(HASH_KEY);
    }

    @Override
    public int quantityList() {   
        return template.opsForHash().entries(HASH_KEY).size();
    }
    
}
