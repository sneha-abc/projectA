package com.operator;

public class Substraction {

    public static void main(String[] args){
        System.out.println("calling main method");

        int a=10;
        int b=5;

        int substract=substractTwoNumbers(a,b);
        System.out.println(substract);

    }
    public static int substractTwoNumbers(int a, int b){
        System.out.println("calling substract");
        int c=a-b;
        return c;

    }


}
