package com.inheritance;

public class Transport {
    String mode;
    int capacity;
    int speed;

    public void setMode(String mode){
        this.mode=mode;
    }

    public String getMode(){
        return mode;
    }

    public void setCapacity(int capacity){
        this.capacity=capacity;
    }

    public int  getCapacity(){
        return capacity;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }

    public int  getSpeed(){
        return speed;
    }

    public void airplane() {
        System.out.println("airplane");
    }
}

