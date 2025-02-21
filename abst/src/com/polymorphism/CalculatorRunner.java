package com.polymorphism;

public class CalculatorRunner {
    public static void main(String[] args){

        Calculator object = new Calculator();//object creation of calculator

        int result1 =object.add(1,2);//setting values and storing in one variable
        System.out.println(result1);

        double result2 = object.add(10.11,10.44);
        System.out.println(result1);

        double result3 = object.add(5.12,10.87,12.15);
        System.out.println(result3);

        int result4 = object.add(1,2,3);
        System.out.println(result4);


    }
}
