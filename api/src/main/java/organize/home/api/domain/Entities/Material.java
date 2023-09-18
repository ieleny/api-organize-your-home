package organize.home.api.domain.Entities;

public class Material 
{
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
