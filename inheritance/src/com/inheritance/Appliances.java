package com.inheritance;

public class Appliances {
    String brand;
    String powerSource;
    int capacity;

    public Appliances()
    {
        //default super() Statment
        System.out.println("Non parameterised constructor");
    }

    public Appliances(String brand, String powerSource) {
        this();
        System.out.println("Parameterised  constructor");
        this.brand = brand;
        this.powerSource = powerSource;
    }
     public void setCapacity(int capacity){
        this.capacity=capacity;
     }
     public int getCapacity()
     {
         return  capacity;
     }
     public String getBrand()
     {
         return  brand;
     }
     public String getPowerSource()
     {
         return powerSource;
     }
}
