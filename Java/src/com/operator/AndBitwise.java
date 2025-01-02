package com.operator;

public class AndBitwise {
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        int multiply = multiplication(a, b);
        System.out.println(multiply);

    }

    public static int multiplication(int a, int b) {

        System.out.println("multiply");
        int c = 6 & 9;
        return c;

    }
}