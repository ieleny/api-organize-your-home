package organize.home.api.infrastructure.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import organize.home.api.application.interfaces.IMaterialRepository;
import organize.home.api.application.model.MaterialRowMapper;
import organize.home.api.domain.entities.Material;

@Repository
public class MaterialRepository implements IMaterialRepository
{
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MaterialRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Material> findAll() {
        String sql = "SELECT * FROM material";
        return jdbcTemplate.query(sql, new MaterialRowMapper());
    }

    @Override
    public int addMaterial(Material material) {
        
        // Dois repository do Redis e MySql
        // Colocar a lógica aqui

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
