package com.inheritance;

public class Car extends Vehicle{
    int numberOfDoors;


    public Car()

    {
        System.out.println("Non parametrized car class  constructor");
    }
    public Car(int numberOfDoors)
    {
        System.out.println("Parametrized car class  constructor");
        this.numberOfDoors=numberOfDoors;

    }
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }

    void carName(){
        System.out.println("car is BMW");
    }
    public static void main(String[] args){
        Car car = new Car();//non parameterized car class constructor
        Car car1 = new Car(5);//parameterized car class constructor
        car1.carName();

        Vehicle veh = new Vehicle();//non parameterized Vehicle class constructor
        Vehicle veh1 = new Vehicle("tvs");// parameterized Vehicle class constructor

        System.out.println(veh1.getBrand());
        veh1.vehicleStarts();
    }
}
