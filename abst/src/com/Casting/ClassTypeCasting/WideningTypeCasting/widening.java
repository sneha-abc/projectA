package com.Casting.ClassTypeCasting.WideningTypeCasting;

public class widening {

    public static void main(String[] args){
//implicit casting
        System.out.println("widening casting from byte to short");
        byte a=127;
        short b=a;
        System.out.println(a);
        System.out.println(b);


        System.out.println("widening casting from short to int");
        short c=2589;
        int d=c;
        System.out.println(c);
        System.out.println(d);

        System.out.println("widening casting from int to long");
        int e=1596321;
        long f=e;
        System.out.println(e);
        System.out.println(f);

        System.out.println("widening casting from float to double");
        float g=1582.15f;
        double h=g;
        System.out.println(g);
        System.out.println(h);

        System.out.println("widening casting from byte to int");
        byte i=111;
        short j=i;
        System.out.println(i);
        System.out.println(j);

        System.out.println("widening casting from byte to long");
        byte k=100;
        short l=k;
        System.out.println(k);
        System.out.println(l);

        System.out.println("widening casting from byte to float");
        byte m=121;
        float n=m;
        System.out.println(m);
        System.out.println(n);


        System.out.println("widening casting from int to float");
        int o=125562;
        float p=m;
        System.out.println(o);
        System.out.println(p);

        System.out.println("widening casting from long to double");
        long q=1478974582;
        double r=q;
        System.out.println(q);
        System.out.println(r);



    }
}
