package com.inheritance;

public class Bike extends Vehicle{
    int numberOfGear;

    public Bike(){
        System.out.println("non parameterized bike class constructor");
    }

    public Bike(int numberOfGear){
        this.numberOfGear=numberOfGear;
    }

    public int getNumberOfGear(){
        return numberOfGear;
    }

    void getBikeName(){
        System.out.println("bike name is honda");
    }

    public static void main (String[] args){
        Bike bi = new Bike();//non parameterized bike class constructor
        Bike bi1 = new Bike(4);//parameterized bike class constructor

        System.out.println(bi1.getNumberOfGear());
        bi1.getBikeName();



        Vehicle veh = new Vehicle();//non parameterized Vehicle class constructor
        Vehicle veh1 = new Vehicle("tvs");// parameterized Vehicle class constructor

        System.out.println(veh1.getBrand());
        veh1.vehicleStarts();
    }

}
