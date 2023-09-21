package organize.home.api.application.interfaces;

import java.util.List;

import organize.home.api.domain.entities.CacheData;
import organize.home.api.domain.entities.Material;

public interface IMaterialCacheRepository 
{
    List<Object> findAll();
    void save(CacheData cacheData, List<Material> materials);
    int quantityList();
}