package com.polymorphism;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public double add(double a,double b){//method overloading
        return a+b;
    }

    public double add(double a, double b,double c){//method overloading
        return  a+b+c;
    }

    public int add(int a,int b,int c){//method overloading
        return a+b+c;
    }

        public float add(float a, float b){
        return a+b;
        }


}
