package com.MethodOverloading;

public class Fan {
    String voltage;
    int noOfWings;
    String colour;

    public void fanInfo(String voltage){
        this.voltage=voltage;
    }

    public void fanInfo(String voltage , int noOfWings) {
        this.voltage=voltage;
        this.noOfWings = noOfWings;

    }

    public void fanInfo(String voltage , int noOfWings , String colour){
        this.voltage=voltage;
        this.noOfWings = noOfWings;
        this.colour=colour;
    }

    public String getVoltage(){
        return voltage;
    }
    public int getNoOfWings(){
        return noOfWings;
    }
    public  String getColour(){
        return colour;
    }
    public void rotate(){
        System.out.println("it rotates-parent class");
    }
    public static void main(String[] args){
        Fan fan = new Fan();

        fan.fanInfo ("120V");
        System.out.println(fan.getVoltage());

        fan.fanInfo("200 V",4);
        System.out.println(fan.getVoltage());
        System.out.println(fan.getNoOfWings());

        fan.fanInfo("110 V",3,"black");
        System.out.println(fan.getVoltage());
        System.out.println(fan.getNoOfWings());
        System.out.println(fan.getColour());

    }

}
