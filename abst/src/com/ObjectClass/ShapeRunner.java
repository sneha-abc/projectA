package com.ObjectClass;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape = new Shape(4, "square");
        System.out.println(shape.toString());
        System.out.println(shape.hashCode());

        Shape shape1 = new Shape(6, "hexagon");
        System.out.println(shape1.toString());
        System.out.println(shape1.hashCode());

        Shape shape2 = new Shape(4, "square");
        System.out.println(shape2.toString());
        System.out.println(shape2.hashCode());

        System.out.println(shape2 == shape1);
        System.out.println(shape2.equals(shape));
    }
}