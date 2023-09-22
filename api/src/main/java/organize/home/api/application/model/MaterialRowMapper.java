package organize.home.api.application.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import organize.home.api.domain.entities.Material;

public class MaterialRowMapper implements RowMapper<Material>
{

    @Override
    public Material mapRow(ResultSet result, int rowNum) throws SQLException {
        return new Material(
            result.getString("id_material"),
            result.getString("product_name"),
            result.getFloat("price_und"),
            result.getInt("quantity_bought")
        );
    }
    
}
