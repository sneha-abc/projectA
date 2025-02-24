package com.LogicalPrograms;

public class Swapp {
    public static void main(String[] args){
        int a=10 ;
        int b = 20 ;
        int c;
        System.out.println("before swapping a=" +a +",b=" +b);

        c=a;
        a=b;
        a=c;

        System.out.println("After swapping a="+a+".b="+b);


    }
}
