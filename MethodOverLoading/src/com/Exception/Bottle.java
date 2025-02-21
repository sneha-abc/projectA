package com.Exception;

public class Bottle {
    int bottleCapacity;

    public void setBottleCapacity(int bottleCapacity){
        this.bottleCapacity=bottleCapacity;
    }

    public int getBottleCapacity(){
        return bottleCapacity;
    }

    public void callerMethodException(){
        int capacity=100;

        if(bottleCapacity<=capacity){
            System.out.println("water can be stored in bottel");
        }
        else{
            throw new WaterOverflowException("water will be over flowed from bottel");
        }
    }
    public static void main(String[] args){
        Bottle bottle=new Bottle();

        System.out.println("the capacity of the bottel is 100 ml");
        bottle.setBottleCapacity(110);
        try {
            bottle.callerMethodException();
        }catch(WaterOverflowException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("capacity is upto 100 ml");
        }
        System.out.println("exception is handeled in caller method");
    }
    }

