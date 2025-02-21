package com.Exception;

public class Lap {
    int price;

    public Lap(int price){
        this.price=price;
    }

    public int getPrice(){
        return  price;
    }
    public static void main(String[] args){
        Lap lap = new Lap(15000);
        if(lap.getPrice()>200000){
            System.out.println("Reasonable cost for laptop");
        }
        else{

            throw new LapException("low cost and cheap quality");
        }
    }
}
