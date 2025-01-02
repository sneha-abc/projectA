package com.inheritance;

public class Vehicle {
    String brand;


    public Vehicle(){
        System.out.println("non parameterized vehicle class constructor");
    }
    public Vehicle(String brand){
        this.brand=brand;
        System.out.println(" parameterized vehicle class constructor");
    }
    public String getBrand(){
        return brand;
    }
     void vehicleStarts(){
        System.out.println("All vehicle starts");
     }
}