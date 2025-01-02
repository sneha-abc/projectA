package com.inheritance;

public class Airplane extends Transport{
    String transportType;        // default
    protected static String fuelType; // protected static
    private int capacity;        // private
    static final float constant = 3.14f; // final static constant
    final int wheels = 4;        // final instance variable
    public String company;       // public

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    private void displayType() {
        System.out.println("This is a transport vehicle.");
    }

    public static final void constantMethod() {
        System.out.println("This is a static final method.");
    }

    public final void setWheels(int wheels) {
        System.out.println("This is a non-static final method, wheels are constant.");
    }

    public static void setFuelType(String fuel) {
        fuelType = fuel;
    }

    public static String getFuelType() {
        return fuelType;
    }

    void location() {
        System.out.println("Transports are located in various depots.");
    }

    protected void transportFeature() {
        System.out.println("Transports are used to move goods and people.");
    }
}

