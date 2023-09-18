package organize.home.api.infrastructure.repository;

import java.util.List;
import java.util.Optional;

import organize.home.api.domain.Entities.Material;

public interface IMaterialRepository 
{    
   List<Material> findAll();
   int addMaterial(Material material);
   Optional<Material> findById(int id);
   int deleteMaterial(int id);
   int updateMaterial(int id, Material employee);
}
