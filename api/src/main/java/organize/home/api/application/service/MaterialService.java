package organize.home.api.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import organize.home.api.domain.entities.Material;
import organize.home.api.infrastructure.repository.IMaterialRepository;

@Service
public class MaterialService {
    
    private final IMaterialRepository materialRepository;

    @Autowired
    public MaterialService(IMaterialRepository materialRepository){
        this.materialRepository = materialRepository;
    }

    public void addMaterial(@Valid Material material) {
        this.materialRepository.addMaterial(material);
    }
}
