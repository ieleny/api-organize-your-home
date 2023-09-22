package organize.home.api.application.interfaces;

import java.util.List;

import organize.home.api.domain.entities.Material;

public interface IMaterialRepository 
{    
   List<Material> findAll();
   String addMaterial(Material material);
}