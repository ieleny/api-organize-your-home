package organize.home.api.infrastructure.repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import organize.home.api.application.interfaces.IMaterialRepository;
import organize.home.api.application.model.MaterialRowMapper;
import organize.home.api.domain.entities.Material;

@Repository
public class MaterialRepository implements IMaterialRepository
{
    @Autowired
    private final JdbcTemplate jdbcTemplate;

    public MaterialRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Material> findAll() {
        String sql = "SELECT * FROM material";
        return jdbcTemplate.query(sql, new MaterialRowMapper());
    }

    @Override
    public String addMaterial(Material material) {

        String idMaterial = "-1";

        try {

            String sql = """
                INSERT into material(product_name,quantity_bought,price_und)
                VALUES (?,?,?);""";
           
            jdbcTemplate.update(sql, 
                    material.getProductName(),
                    material.getQuantityBought(),
                    material.getPriceUnd()
                );
            
            
            idMaterial = lastId().toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return idMaterial;
    }

    protected BigInteger lastId(){

        BigInteger lastId = BigInteger.valueOf(-1);

        try {
            String sql = "SELECT LAST_INSERT_ID() as id_material FROM material";
            List<Map<String,Object>> material = jdbcTemplate.queryForList(sql);

            lastId = (BigInteger) material.get(0).get("id_material");
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lastId;
    }
    
}
