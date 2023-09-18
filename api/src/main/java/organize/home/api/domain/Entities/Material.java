package organize.home.api.domain.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@EntityScan
public class Material 
{
    @NotNull(message = "O nome não pode ser nullo")
    @NotBlank(message = "O nome não pode ser vazio")
    private String productName;
    private Float priceUnd;
    private Integer quantityBought;

    public String getProductName() {
        return productName;
    }

    public Float getPriceUnd() {
        return priceUnd;
    }

    public Integer getQuantityBought() {
        return quantityBought;
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
