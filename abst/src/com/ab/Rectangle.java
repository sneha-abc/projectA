package com.ab;

public class Rectangle implements Shape{
    private int length;
    private int breadth;
    public Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public double area() {
        return length*breadth;
    }
}
