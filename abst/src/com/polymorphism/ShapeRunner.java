package com.polymorphism;

public class ShapeRunner {

    public static void main(String[] args){

    Shape shape=new Shape();


    int area1=shape.area(2);
        System.out.println(area1);

    int area2 = shape.area(2,4);
        System.out.println(area2);

    double area3 = shape.area(2,2.2f);
        System.out.println(area3);
    }
}
