package com.inheritance.accesspecifier;

import com.inheritance.Shirt1;

public class Airplane1 extends Transport1 {
    public static void main(String[] args) {
        Airplane1 airplane1 = new Airplane1();

        System.out.println(".................From Same Package");
        airplane1.setCapacity(150);//accessing final instance variable
        System.out.println("Capacity: " + airplane1.getCapacity()); // accessing private variable through methods

        constantMethod(); // accessing static final method
        airplane1.setWheels(3);//accessing final instance variable
       // airplane1.displayType();
        constantMethod( );
        setFuelType("Jet Fuel");
        System.out.println("Fuel Type: " + getFuelType()); // accessing protected static variable

        airplane1.location(); // default method
        airplane1.transportFeature(); // protected method

        airplane1.transportType = "Air Transport"; // default variable
        airplane1.company = "Boeing";             // public variable
        System.out.println("Transport Type: " + airplane1.transportType);
        System.out.println("Company: " + airplane1.company);

        //airplane1.size = "Medium";
         //airplane1.color = "Blue";//default
        //airplane1.price = 500;
        // variable airplane1.setIroned(true);//private

        //System.out.println("Shirt Size: " + airplane1.size);
       // System.out.println("Shirt Color: " + airplane1.color);
        //System.out.println("Shirt Price: " + airplane1.price);
        //System.out.println("Is Ironed: " + airplane1.getIroned());

        //airplane1.brand(); // default method
        //airplane1.discount(); // protected method

    }
}