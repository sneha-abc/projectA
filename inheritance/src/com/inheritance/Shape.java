package com.inheritance;

public class Shape {
    String color;
    String borderColor;
    double area;

    public void setColor(String color ){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public void setBorderColor(String borderColor ){
        this.borderColor=borderColor;
    }

    public String getBorderColor(){
        return borderColor;
    }

    public void setArea(double area){
        this.area=area;
    }

    public double getArea(){
        return area;
    }

    public void shape(){
        System.out.println("shape");
    }
}
