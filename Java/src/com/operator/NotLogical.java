package com.operator;

public class NotLogical {
    public static void main(String[] args){
        boolean foodTastesGood=true;
        boolean check=checking(foodTastesGood);
        System.out.println(check);
    }
    public static boolean checking(boolean foodTastesGood){
        System.out.println("check");
        boolean result=! foodTastesGood;
        return result;





    }

}
