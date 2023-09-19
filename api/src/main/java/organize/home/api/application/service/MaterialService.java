package organize.home.api.application.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
import organize.home.api.application.interfaces.IMaterialRepository;
import organize.home.api.domain.entities.Material;

@Service
public class MaterialService 
{   
    private final IMaterialRepository materialRepository;

    @Autowired
    public MaterialService(
        IMaterialRepository materialRepository
    ) {
        this.materialRepository = materialRepository;
    }

    public List<Material> listMaterial() {
        return materialRepository.findAll();
    }

    public void addMaterial(@Valid Material material) {
        materialRepository.addMaterial(material);
    }
}
