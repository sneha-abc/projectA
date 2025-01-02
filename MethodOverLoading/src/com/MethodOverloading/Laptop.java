package com.MethodOverloading;

public class Laptop {
    String brand;
    int ram;

    public Laptop(String brand,int ram){
        System.out.println("parameterizes parent constructor");
        this.brand=brand;
        this.ram=ram;
    }
    public String getBrand(){
        return brand;
    }
    public int getRam(){
        return ram;
    }
    public void capacity(){
        System.out.println("we can use the laptop upto 18hr once charged");
    }
}
