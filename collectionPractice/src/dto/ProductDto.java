package dto;

import java.io.Serializable;
import java.util.Objects;

public class ProductDto implements Serializable,Comparable<ProductDto> {
    private  String productId;
    private String productName;
    private String brand;
    private int cost;
    private int discount;

    public ProductDto(){

    }


    public ProductDto(String productId, String productName, String brand, int cost, int discount) {
        this.productId = productId;
        this.productName = productName;
        this.brand = brand;
        this.cost = cost;
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ProductDto)) return false;
        ProductDto that = (ProductDto) o;
        return cost == that.cost && Objects.equals(productName, that.productName) && Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName,brand);
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", cost=" + cost +
                ", discount=" + discount +
                '}';
    }

    @Override
    public int compareTo(ProductDto o) {
        return this.brand.compareTo(o.brand);
    }
}
