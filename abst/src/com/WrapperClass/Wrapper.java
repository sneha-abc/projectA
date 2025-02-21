package com.WrapperClass;

public class Wrapper {
    public static void main(String[] args){

        System.out.println("byte primitive to Byte wrapper class");
        byte a=5;
        Byte byteWrapper =new Byte(a);//using constructor
        Byte byteWrapper1 =  new Byte("10");//using string
        System.out.println(byteWrapper);
        System.out.println(byteWrapper1);


        System.out.println("short primitive to Short wrapper class");
        short b=10;
        Short shortWrapper =new Short(b);//using constructor
        Short shortWrapper1 =  new Short("15");//using string
        System.out.println(byteWrapper);
        System.out.println(byteWrapper1);



        System.out.println("int primitive to Integer wrapper class");
        int c=15;
        Integer integer =new Integer(c);//using constructor
        Integer integer1 =  new Integer("10");//using string
        System.out.println(integer);
        System.out.println(integer1);

        System.out.println("long primitive to Long wrapper class");
        long d=20;
        Long longWrapper =new Long(d);//using constructor
        Long longWrapper1 =  new Long("80");//using string
        System.out.println(longWrapper);
        System.out.println(longWrapper1);


        System.out.println("float primitive to Float wrapper class");
        float e=12.24f;
        Float floatWrapper =new Float(e);//using constructor
        Float floatWrapper1 =  new Float("158.15");//using string- without mentioning f or d
        Float floatWrapper2 =  new Float("102.25f");//using string- by using f
        Float floatWrapper3 =  new Float("102.25d");//using string-by using d
        System.out.println(longWrapper);
        System.out.println(longWrapper1);
        System.out.println(floatWrapper2);
        System.out.println(floatWrapper3);


        System.out.println("double primitive to Double wrapper class");
        double f=232.25;
        Double doubleWrapper =new Double(e);//using constructor
        Double doubleWrapper1 =  new Double("60.284");//using string- without mentioning f or d
        Double doubleWrapper2 =  new Double("3256.15f");//using string- by using f
        Double doubleWrapper3 =  new Double("1863.2558d");//using string-by using d
        System.out.println(longWrapper);
        System.out.println(longWrapper1);
        System.out.println(floatWrapper2);
        System.out.println(floatWrapper3);


        System.out.println("char primitive to Character Wrapper class");
        char g ='a';
        Character characterWrapper = new Character(g);//using constructor
        //we can not send string value
        System.out.println(characterWrapper);


        System.out.println("boolean primitive to Boolean wrapper class");
        boolean h = true;
        Boolean booleanWrapper = new Boolean(h);
        Boolean booleanWrapper1 = new Boolean("java");//if we send any other value other than true or false we get false
        System.out.println(booleanWrapper);
        System.out.println(booleanWrapper1);

        








    }
}
