package com.polymorphism;

public class Shape {
    public int area(int side){
        return side*side*side*side;
    }

    public int area(int length,int breadth){
        return length*breadth;
    }

    public double area(int radius,float pi){
        return pi*radius*radius;
    }



}
