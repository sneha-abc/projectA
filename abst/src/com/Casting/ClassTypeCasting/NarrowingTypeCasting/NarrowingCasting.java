package com.Casting.ClassTypeCasting.NarrowingTypeCasting;

public class NarrowingCasting {
    public static void main(String[] args){

        System.out.println("narrowing casting from int to short");
       // int=4 byte,short=2byte
        int a= 125;
        short b= (short) a;//providing explicit casting to convert larger data type to smaller datatype
        System.out.println(a);
        System.out.println(b);

        System.out.println("narrowing casting from long to short");
            //long=8 byte , short=4 byte
        long c= 1234;
        short d = (short) c;
        System.out.println(c);
        System.out.println(d);


        System.out.println("narrowing casting from double to float ");
        //double=8 byte , float=4 byte
        double e= 1234.1515;
        float f = (float) e;
        System.out.println(e);
        System.out.println(f);

        System.out.println("narrowing casting from long to int");
        //long=8 byte , int=4 byte
        long g= 453788978;
        int h = (int) g;
        System.out.println(g);
        System.out.println(h);




    }
}
