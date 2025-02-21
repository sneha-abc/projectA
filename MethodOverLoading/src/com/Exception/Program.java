package com.Exception;

public class Program {
public static void main(String[] args){
    int a=10;
    int b=15;

    System.out.println("before swapping");
    System.out.println(" a="+a);
    System.out.println(" b="+b);

    a=a+b;  //10+15=25
    b=a-b;  //25-15=10
    a=a-b;  //25-10=15

    System.out.println("after swapping");
    System.out.println(" a="+a);
    System.out.println(" b="+b);

}
}
