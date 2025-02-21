package com.Operations;

public class Clothes {
    private int price;
    private String type;
    private String size;
    private String brand;

    public Clothes(int price,String type,String size,String brand){
        this.price=price;
        this.type=type;
        this.size=size;
        this.brand=brand;
    }

    public void setPrice(int price){
        this.price=price;

    }
    public void setType(String type){
        this.type=type;
    }
    public void setSize(String size){
        this.size=size;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

    public int getPrice(){
        return price;
    }
    public String getType(){
        return type;
    }
    public String getSize() {
        return size;
    }
    public String getBrand(){
        return brand;
    }

    public String toString(){

        return "price-" + price+ "type-"+ type + "size-" +size + "brand-" + brand;
    }






}
