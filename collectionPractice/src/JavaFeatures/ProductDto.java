package JavaFeatures;

import java.io.Serializable;

public class ProductDto implements Serializable,Comparable {

    private String productName;

    private String type;

    private  int price;

    public  ProductDto(){

    }

    public ProductDto(String productName, String type, int price) {
        this.productName = productName;
        this.type = type;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
