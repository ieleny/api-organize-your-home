package organize.home.api.application.interfaces;

import java.util.List;
import java.util.Map;

import organize.home.api.domain.entities.CacheData;
import organize.home.api.domain.entities.Material;

public interface IMaterialCacheRepository 
{
    Map<String, Material> findAll();
    Material save(Material material);
}
