package com.WrapperClass;
//ToString method -used to convert wrapper object to string
public class ToStringMethod {
    public static void main(String[] args){

        System.out.println("Byte wrapper object to string");
        Byte a=Byte.valueOf((byte) 2);
        String byteToString = a.toString();
        System.out.println(byteToString);

        System.out.println("Short wrapper object to string");
        Short b=Short.valueOf((short) 2);
        String shortToString = a.toString();
        System.out.println(shortToString);

        System.out.println("Integer wrapper object to string");
        Integer c=Integer.valueOf(10);
        String integerToString = c.toString();
        System.out.println(integerToString);

        System.out.println("Long wrapper object to string");
        Long d=Long.valueOf(4575);
        String longToString = d.toString();
        System.out.println(longToString);


        System.out.println("float wrapper object to string");
        Float e=Float.valueOf(45.15f);
        String floatToString = e.toString();
        System.out.println(floatToString);


        System.out.println("Double wrapper object to string");
        Double f=Double.valueOf(9024.15);
        String doubleToString = e.toString();
        System.out.println(doubleToString);


        System.out.println("Character wrapper object to string");
        Character g=Character.valueOf('a');
        String  charToString = g.toString();
        System.out.println(charToString);

        System.out.println("Boolean wrapper object to string");
        Boolean h=Boolean.valueOf(true);
        String  booleanToString = h.toString();
        System.out.println(booleanToString);



    }
}
