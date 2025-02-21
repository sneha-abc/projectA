package com.WrapperClass;
//parseexxx() -string to primitive
public class Parsexxx {
    public static void main(String[] args){

        System.out.println("string to byte primitive ");
        byte  stringtobyte = Byte.parseByte("2");
        System.out.println(stringtobyte);

        System.out.println("string to short primitive ");
        short stringtoshort = Short.parseShort("3");
        System.out.println(stringtoshort);

        System.out.println("string to int primitive ");
        int stringtoint = Integer.parseInt("152");
        System.out.println(stringtoint);


        System.out.println("string to long primitive ");
        long stringtolong = Long.parseLong("12562");//this won't take l
        System.out.println(stringtolong);

        System.out.println("string to float primitive ");
        float stringtofloat = Float.parseFloat("125.36");
        float stringtofloat1 = Float.parseFloat("125.36f");
        float stringtofloat2 = Float.parseFloat("125.36d");
        System.out.println(stringtofloat);
        System.out.println(stringtofloat1);
        System.out.println(stringtofloat2);

        System.out.println("string to double primitive ");
        double stringtodouble = Double.parseDouble("12359.15");
        double stringtodouble1 =Double.parseDouble("45832.36f");
        double stringtodouble2 =Double.parseDouble("486256.36d");
        System.out.println(stringtodouble);
        System.out.println(stringtodouble1);
        System.out.println(stringtodouble2);


        //string can  not be converted to char

        System.out.println("string to boolean primitive ");
        boolean  stringToBoolean = Boolean.parseBoolean("true");
        boolean  stringToBoolean1 = Boolean.parseBoolean("false");
        boolean  stringToBoolean2 = Boolean.parseBoolean("java");
        System.out.println(stringToBoolean);
        System.out.println(stringToBoolean1);
        System.out.println(stringToBoolean2);


//javap java.lang.string  get all  the methods
        //javap java.lang.object

    }
}
