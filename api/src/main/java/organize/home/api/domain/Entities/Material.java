package organize.home.api.domain.entities;

import java.io.Serializable;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@EntityScan
@RedisHash("MATERIAL")
public class Material implements Serializable
{
    @Id
    private String id;

    @NotNull(message = "O nome não pode ser nullo")
    @NotBlank(message = "O nome não pode ser vazio")
    private String productName;

    private Float priceUnd;

    @Min(1)
    private Integer quantityBought;

    @TimeToLive
    private Long expiration = 1000L;

    public Material(String id, String productName, Float priceUnd, Integer quantityBought) {
        this.id = id;
        this.productName = productName;
        this.priceUnd = priceUnd;
        this.quantityBought = quantityBought;
    }

    public String getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public Float getPriceUnd() {
        return priceUnd;
    }

    public Integer getQuantityBought() {
        return quantityBought;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPriceUnd(Float priceUnd) {
        this.priceUnd = priceUnd;
    }
    
    public void setQuantityBought(Integer quantityBought) {
        this.quantityBought = quantityBought;
    }

}
