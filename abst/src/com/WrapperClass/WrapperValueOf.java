package com.WrapperClass;

public class WrapperValueOf {
    //primitive datatypes to wrapper class using value of method
    public static void main(String[] args){

        System.out.println("byte primitive to Byte wrapper class using valueOf method");
        Byte byteWrapper = Byte.valueOf((byte) 2);
        Byte byteWrapper1 = Byte.valueOf("2");
        System.out.println(byteWrapper);
        System.out.println(byteWrapper1);


        System.out.println("short primitive to Short wrapper class using valueOf method");
        Short shortWrapper = Short.valueOf((short) 10);
        Short shortWrapper1 = Short.valueOf("12");
        System.out.println(shortWrapper);
        System.out.println(shortWrapper);


        System.out.println("int primitive to Integer wrapper class using valueOf method");
        Integer integerWrapper = Integer.valueOf(1);
        Integer integerWrapper1 = Integer.valueOf("20");
        System.out.println(integerWrapper);
        System.out.println(integerWrapper1);


        System.out.println("long primitive to Long wrapper class using valueOf method");
        Long longWrapper = Long.valueOf(1);
        Long longWrapper1 = Long.valueOf("56");
        System.out.println(integerWrapper);
        System.out.println(integerWrapper1);
        //no need to specify l

        System.out.println("float primitive to Float wrapper class using valueOf method");
        Float floatWrapper = Float.valueOf(12.36f);
        Float floatWrapper1 = Float.valueOf("15.18");
        System.out.println(integerWrapper);
        System.out.println(integerWrapper1);
        //this accepts only float values (f)

        System.out.println("double primitive to Double wrapper class using valueOf method");
        Double doubleWrapper = Double.valueOf(12.36f);
        Double doubleWrapper1 = Double.valueOf(12.36d);
        Double doubleWrapper2 = Double.valueOf("15.18");
        System.out.println(integerWrapper);
        System.out.println(integerWrapper1);
        //this accepts float values also


        System.out.println("char primitive to Character wrapper class using valueOf method");
        Character characterWrapper = Character.valueOf('a');
        System.out.println(characterWrapper);

        System.out.println("boolean primitive to Boolean wrapper class using valueOf method");
        Boolean booleanWrapper = Boolean.valueOf(true);
        Boolean booleanWrapper1 = Boolean.valueOf("false");
        Boolean booleanWrapper2 = Boolean.valueOf("java");
        System.out.println(booleanWrapper);
        System.out.println(booleanWrapper1);
        System.out.println(booleanWrapper2);

        System.out.println();
        System.out.println("==============================");

        System.out.println("Byte Wrapper object to byte primitive");
        byte a = byteWrapper.byteValue();
        System.out.println(a);

        System.out.println("Short Wrapper object to short primitive");
        short b = shortWrapper.shortValue();
        System.out.println(b);


        System.out.println("Integer Wrapper object to int primitive");
        int c = integerWrapper.intValue();
        System.out.println(c);


        System.out.println("Long Wrapper object to long primitive");
        long d = longWrapper.longValue();
        System.out.println(d);


        System.out.println("Float Wrapper object to float primitive");
        float e = floatWrapper.floatValue();
        System.out.println(e);


        System.out.println("Double Wrapper object to double primitive");
        double f = doubleWrapper.doubleValue();
        System.out.println(f);


        System.out.println("Charactrer Wrapper object to char primitive");
        char g = characterWrapper.charValue();
        System.out.println(g);

        System.out.println("Boolean Wrapper object to boolean primitive");
        boolean h = booleanWrapper2.booleanValue();
        System.out.println(h);


//parse string to primitive //to string non static menthod










    }
}
