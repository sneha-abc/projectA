package com.MethodOverloading;

public class BodyLotion {
    String brand;
    String type;
    int price;
    public void BodyLotationInfo(String brand){
        this.brand=brand;
    }

    public void BodyLotationInfo(String brand , String type) {
        this.brand=brand;
        this.type = type;

    }

    public void BodyLotationInfo(String brand , String type , int price){
        this.brand=brand;
        this.type = type;
        this.price = price;

    }

    public String getBrand(){
        return brand;
    }
    public  String getType(){
        return type;
    }
    public int getPrice(){
        return price;
    }

    public static void main(String[] args){
        BodyLotion bl = new BodyLotion();

        bl.BodyLotationInfo("nivya");
        System.out.println(bl.getBrand());

        bl.BodyLotationInfo("ponds","alovera");
        System.out.println(bl.getBrand());
        System.out.println(bl.getType());

        bl.BodyLotationInfo("vasaline","coco",300);
        System.out.println(bl.getBrand());
        System.out.println(bl.getType());
        System.out.println(bl.getPrice());


    }
}
