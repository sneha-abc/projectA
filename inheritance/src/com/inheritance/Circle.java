package com.inheritance;

public class Circle extends Shape{
    public void radius()
    {
        System.out.println("circle has radius");
    }

    public static void main(String[] args){

        Circle cir = new Circle();

        cir.setColor("blue");
        System.out.println(cir.getColor());

        cir.setBorderColor("black");
        System.out.println(cir.getBorderColor());

        cir.setArea(3.42);
        System.out.println(cir.getArea());

        cir.shape();
        cir.radius();
    }
}
