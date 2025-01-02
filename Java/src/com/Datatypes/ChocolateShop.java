package com.Datatypes;

public class ChocolateShop {
    public static void main(String[] args) {
        System.out.println("Calling main method");


        String chocolate = getMeChocolateFromShop(30);

        System.out.println(chocolate);

    }


    public static String getMeChocolateFromShop(int money) {
        System.out.println("Calling getMeChocolateFromShop");
        return "Dairy Milk";
    }
}
class CarsCount {
    public static void main(String[] args) {
        System.out.println("Calling main method");


        int cars = numberOfCars(10);

        System.out.println(cars);

    }


    public static int  numberOfCars(int number) {
        System.out.println("Calling  numberOfCars");
        return  10;
    }
}

class TestFloat {
    public static void main(String[] args) {
        System.out.println("Calling main method");


        float pi = valueOfPi(3.14f);

        System.out.println(pi);

    }


    public static float valueOfPi(float value) {
        System.out.println("Calling  valueOfPi");
        return  3.14f;
    }
}


class  TestDouble{
    public static void main(String[] args) {
        System.out.println("Calling main method");


        double dValue = getdvalue(25.23d);

        System.out.println(dValue);

    }


    public static double getdvalue(double d) {
        System.out.println("Calling  dValue");
        return  25.23d;
    }
}


class TestLong{
    public static void main(String[] args) {
        System.out.println("Calling main method");


        long lvalue = getlvalue(123456789L);

        System.out.println(lvalue);

    }


    public static long getlvalue(long l) {
        System.out.println("Calling  lvalue");
        return  123456789L;
    }
}

class TestBoolean{
    public static void main(String[] args) {
        System.out.println("Calling main method");


        boolean sunRisesInTheEast = getboolean(true);

        System.out.println(sunRisesInTheEast);

    }


    public static boolean getboolean (boolean b) {
        System.out.println("Calling  getboolean");
        return  true;
    }
}

class TestChar{
    public static void main(String[] args) {
        System.out.println("Calling main method");


        char lettera = getlettera('a');

        System.out.println(lettera);

    }


    public static char getlettera (char  a) {
        System.out.println("Calling  getlettera");
        return  'a';
    }
}


class TestByte{
    public static void main(String[] args) {
        System.out.println("Calling main method");


        byte bytevalue = getbytevalue((byte)1);

        System.out.println( bytevalue);

    }


    public static byte getbytevalue(byte n) {
        System.out.println("Calling  getbytevalue");
        return  8;
    }
}
