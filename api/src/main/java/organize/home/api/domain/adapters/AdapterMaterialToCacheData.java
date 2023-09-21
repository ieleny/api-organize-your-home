package organize.home.api.domain.adapters;

import organize.home.api.domain.entities.CacheData;
import organize.home.api.domain.entities.Material;

public class AdapterMaterialToCacheData extends Material
{
    private CacheData cacheData;

    public AdapterMaterialToCacheData(Material material, String id) 
    {
        super(id, material.getProductName(), material.getPriceUnd(), material.getQuantityBought());
    }

    public CacheData materialToCacheData(){

        cacheData = new CacheData(
            Integer.valueOf(this.getId()), 
            this.getProductName(), 
            this.getPriceUnd(), 
            this.getQuantityBought()
        );

        return cacheData;
    }

}
