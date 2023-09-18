package organize.home.api.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import organize.home.api.domain.Entities.Material;
import organize.home.api.infrastructure.repository.IMaterialRepository;

@Repository
public class MaterialService implements IMaterialRepository
{
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MaterialService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Material> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public int addMaterial(Material material) {
        
        String sql = """
           INSERT into material(product_name,quantity_bought,price_und)
           VALUES (?,?,?);
                          """;
           
        return jdbcTemplate.update(sql, material.getProductName(),
                    material.getQuantityBought(),
                    material.getPriceUnd());
    }

    @Override
    public Optional<Material> findById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public int deleteMaterial(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteMaterial'");
    }

    @Override
    public int updateMaterial(int id, Material employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateMaterial'");
    }
    
}
