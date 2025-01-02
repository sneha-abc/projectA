package com.inheritance;

public class Appliance {
    String brand;
    String powerSource;
    boolean warranty;

    public void setBrand(String brand){
        this.brand=brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setPowerSource(String powerSource){
        this.powerSource=powerSource;
    }

    public String getPowerSource(){
        return powerSource;
    }

    public void setWarranty(boolean warranty){
        this.warranty=warranty;
    }

    public boolean getWarranty(){
        return  warranty;
    }

    public void appliance(){
        System.out.println("appliance");
    }
}
