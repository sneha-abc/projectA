package com.LogicalPrograms;
//without using 3rd variable
public class Swapping {
    public static void main(String[] args){
        int a=2;
        int b=3;

        System.out.println("before swapping a=" + a + ", b = " + b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a=" +a +", b=" + b);
    }
}
