package com.operator;

public class AndLogical {
    public static void main(String[] args){
        boolean bangaloreIsASiliconCity=true;
        boolean bangaloreIsNotInKarnataka=false;
        boolean check=checking(bangaloreIsASiliconCity,bangaloreIsNotInKarnataka);
        System.out.println(check);




    }
    public static boolean checking(boolean bangaloreIsASiliconCity,boolean  bangaloreIsNotInKarnataka){
        System.out.println("check");
        boolean result=bangaloreIsASiliconCity&&bangaloreIsNotInKarnataka;
        return result;



    }




}
