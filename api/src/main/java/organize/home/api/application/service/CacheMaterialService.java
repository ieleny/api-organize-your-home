package organize.home.api.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import organize.home.api.domain.adapters.AdapterMaterialToCacheData;
import organize.home.api.domain.entities.Material;
import organize.home.api.infrastructure.repository.CacheMaterialRepository;
import organize.home.api.infrastructure.repository.MaterialRepository;

@Service
public class CacheMaterialService 
{
    @Autowired
    private final CacheMaterialRepository cacheMaterialRepository;
    private final MaterialRepository materialRepository;
    
    public CacheMaterialService(CacheMaterialRepository cacheMaterialRepository, MaterialRepository materialRepository) {
        this.cacheMaterialRepository = cacheMaterialRepository;
        this.materialRepository = materialRepository;
    }
    
    public List<Material> listMaterial() 
    {
        return (List<Material>)(Object) cacheMaterialRepository.findAll().get(0);
    }

    public void addMaterial(@Valid Material material, String id) {

        try {

            if(id != "-1"){
              addCache(material, id);
            }else{
                throw new Exception("O cache não foi salvo");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void addCache(Material material, String id){
        List<Material> materials = materialRepository.findAll();
        AdapterMaterialToCacheData adapterMaterialToCacheData = new AdapterMaterialToCacheData(material, id);
        cacheMaterialRepository.save(adapterMaterialToCacheData.materialToCacheData(), materials);
    }

    public boolean hasCache() {
        boolean hasCache = false;
        int quantityList = this.cacheMaterialRepository.quantityList();

        if(quantityList > 0){
            hasCache = true;
        }
            
        return hasCache;
    }
}
