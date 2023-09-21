package organize.home.api.domain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import organize.home.api.domain.entities.Material;
import organize.home.api.application.service.MaterialService;

@RestController
@RequestMapping("/api/v1/material")
public class MaterialController 
{   
    @Autowired
    private final MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping
    public List<Material> listMaterial() {
        return materialService.listMaterial();
    }

    @PostMapping
    public void create(@Valid @RequestBody Material material) {
        materialService.addMaterial(material);
    }

}
