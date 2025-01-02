package com.inheritance;

public class Clothing {

    String fabric;
    String size;
    String brand;

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;

    }

    public void fashion(){
        System.out.println("clothing is fashion");
    }

}
