package com.inheritance;

public class Karanataka extends Country {
    String stateCapital;

    public Karanataka (){
        System.out.println("non parameterized Karnataka Class constrouctor");

    }
    public Karanataka(String stateCapital){
        this.stateCapital=stateCapital;
    }
    public String getStateCapital(){
        return stateCapital;
    }
    public void population() {
        System.out.println("more than 10 k population");
    }
    public static void main(String[] args){
        Karanataka kar = new Karanataka();
        Karanataka kar1 = new Karanataka("Bangalore");

        System.out.println(kar1.getStateCapital());
        kar1.population();

        Country co = new Country();
        Country co1 = new Country("India");
        System.out.println(co1.getCountryName());
        co1.population();


    }
}
