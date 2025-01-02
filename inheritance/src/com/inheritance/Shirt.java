package com.inheritance;

public class Shirt extends Clothing{
    public void hasCollar()
    {
        System.out.println("shirts have collar");
    }
    public static void main(String[] args){
        Shirt shirt =new Shirt();

        shirt.setFabric("cotton");
        System.out.println(shirt.getFabric());

        shirt.setSize("small");
        System.out.println(shirt.getSize());

        shirt.setBrand("soch");
        System.out.println(shirt.getBrand());

        shirt.fashion();
        shirt.hasCollar();
    }
}
