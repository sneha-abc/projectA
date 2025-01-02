package com.operator;

public class NotBitwise {
    public static void main(String[] args){
        boolean todayIsWorkingDay=false;
        boolean check=checking(todayIsWorkingDay);
        System.out.println(check);


    }
    public static boolean checking(boolean todayIsWorkingDay){
        System.out.println("check");
        boolean output=!todayIsWorkingDay;
        return output;

    }
}
