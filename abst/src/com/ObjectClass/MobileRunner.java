package com.ObjectClass;

public class MobileRunner  {
    public static void main(String[] args)
    {
        Mobile mobile =new Mobile(1,"iphone");
        System.out.println(mobile.toString());
        System.out.println(mobile.hashCode());

        Mobile mobile1=new Mobile(2,"redmi");
        System.out.println(mobile1.toString());
        System.out.println(mobile1.hashCode());

        Mobile mobile3=new Mobile(1,"iphone");
        System.out.println(mobile3.toString());
        System.out.println(mobile3.hashCode());

        System.out.println(mobile==mobile1);//used to compare the reference value
        System.out.println(mobile3.equals(mobile));//used to compare the content
    }
}
