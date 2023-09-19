package organize.home.api.application.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import organize.home.api.application.interfaces.IMaterialRepository;
import organize.home.api.domain.entities.Material;
import organize.home.api.infrastructure.repository.CacheMaterialRepository;

@Service
public class CacheMaterialService 
{
    private final CacheMaterialRepository cacheMaterialRepository;

    @Autowired
    public CacheMaterialService(CacheMaterialRepository cacheMaterialRepository) {
        this.cacheMaterialRepository = cacheMaterialRepository;
    }
    
    public Map<String, Material> listMaterial() 
    {
        return cacheMaterialRepository.findAll();
    }

    public void addMaterial(@Valid Material material) {
        this.cacheMaterialRepository.save(material);
    }
}
