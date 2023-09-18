package organize.home.api.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import organize.home.api.application.service.MaterialService;
import organize.home.api.domain.Entities.Material;

@RestController
@RequestMapping("/api/v1/material")
public class MaterialController 
{
    private final MaterialService materialService;

    @Autowired
    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping
    public String Material() {
        return "Hello i'm MATERIAL";
    }

    @PostMapping
    public void create(@RequestBody Material material) {
        materialService.addMaterial(material);
    }

}
