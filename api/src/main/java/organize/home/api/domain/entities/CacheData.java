package organize.home.api.domain.entities;

import java.io.Serializable;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@EntityScan
@RedisHash("CacheData")
public class CacheData implements Serializable
{
    @Id
    private Integer id;
    private String productName;
    private Float priceUnd;
    private Integer quantityBought;

    public CacheData(Integer id, String productName, Float priceUnd, Integer quantityBought) {
        this.id = id;
        this.productName = productName;
        this.priceUnd = priceUnd;
        this.quantityBought = quantityBought;
    }

    public Integer getId() {
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

    public void setId(Integer id) {
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
