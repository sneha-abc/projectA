package com.Switch;

public class SwitchChar {
    public static void main(String[] args){

        char grade = 'r';

        switch(grade){

            case 'A' :
                System.out.println("marks scored >=90");
                break;
            case 'B' :
                System.out.println("marks scored >=80");
                break;
            case 'C' :
                System.out.println("marks scored >=70");
                break;
            case 'D' :
                System.out.println("marks scored >=60");
                break;
            case 'E' :
                System.out.println("marks scored >=35");
                break;
            case 'F' :
                System.out.println("marks scored <35");
                break;

            default:
                System.out.println("student absent AB");


        }

    }
}
