package com.MethodOverloading;

public class Lays1 extends Lays{
    public void taste(){
        System.out.println("it taste good-child class");

    }
    public static void main(String[] args){
        Lays1 lays1 = new Lays1();
        lays1.taste();
    }
}
