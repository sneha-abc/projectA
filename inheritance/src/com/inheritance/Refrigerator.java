package com.inheritance;

public class Refrigerator extends Appliance{
    public  void capacity(){
        System.out.println("capacity of the refrigerator");
    }

    public static void main(String[] args){
        Refrigerator ref = new Refrigerator();

        ref.setBrand("LG");
        System.out.println(ref.getBrand());

        ref.setPowerSource("Electric");
        System.out.println(ref.getPowerSource());

        ref.setWarranty(true);
        System.out.println(ref.getWarranty());

        ref.appliance();
        ref.capacity();
    }
}
