package com.ObjectClass;

public class MetroRunner {

    public static void main(String[] args){

        Metro metro = new Metro(1,"purple");
        System.out.println(metro.toString());
        System.out.println(metro.hashCode());

        Metro metro1 = new Metro(2,"green");
        System.out.println(metro1.toString());
        System.out.println(metro1.hashCode());


        Metro metro2 = new Metro(1,"purple");
        System.out.println(metro2.toString());
        System.out.println(metro2.hashCode());

        System.out.println(metro==metro2);
        System.out.println(metro.equals(metro2));
    }
}
