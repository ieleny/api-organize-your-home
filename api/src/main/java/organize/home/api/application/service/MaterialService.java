package organize.home.api.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import organize.home.api.application.interfaces.IMaterialRepository;
import organize.home.api.domain.entities.Material;

@Service
public class MaterialService 
{
    @Autowired   
    private final IMaterialRepository materialRepository;
    private final CacheMaterialService cacheMaterialService;

    public MaterialService(
        IMaterialRepository materialRepository,
        CacheMaterialService cacheMaterialService
    ) {
        this.materialRepository = materialRepository;
        this.cacheMaterialService = cacheMaterialService;
    }

    public List<Material> listMaterial() {
        if(cacheMaterialService.hasCache()){
            return cacheMaterialService.listMaterial();
        }
        
        return materialRepository.findAll();
    }

    public void addMaterial(@Valid Material material) {
        try {
            String lastId = materialRepository.addMaterial(material);
            cacheMaterialService.addMaterial(material, lastId);
        } catch (Exception e) {
            System.out.println(e);  
        }
    }
}