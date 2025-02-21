package com.ab;

public class ShapeRunner {
    public static void main(String[] args)
    {
        Shape circle=new Circle(2);
        double areaCircle= circle.area();
        System.out.println(areaCircle);

        Shape rectangle=new Rectangle(2,3);
        double areaRectangle= rectangle.area();
        System.out.println(areaRectangle);
    }
}
