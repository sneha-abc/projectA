package com.inheritance;

public class Building {
    String address;
    int floors;
    String type;

    public Building()
    {
        //default super() Statment
        System.out.println("Non parameterised constructor");
    }

    public Building(String address, int floors) {
        this();
        System.out.println("Parameterised  constructor");
        this.address = address;
        this.floors = floors;
    }

    public void setType(String type)
    {
        this.type=type;
    }

    public String getType()
    {
        return type;
    }
    public String getAddress()
    {
        return address;
    }
    public int getFloors()
    {
        return floors;
    }
}
