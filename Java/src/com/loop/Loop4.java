package com.loop;

public class Loop4 {
    public static void main(String[] argss){

        int marks = 32;

        String grade = "F";

        if(marks >95)
        {grade = "A1";}

        else if(marks >=91 && marks<=95)
        {grade = "A2";}

        else if(marks >=81 && marks<=90)
        {grade = "B1";}

        else if(marks >=71 && marks<=80)
        {grade = "B2";}

        else if(marks >=61 && marks<=70)
        {grade = "C1";}

        else if(marks >=51 && marks<=60)
        {grade = "D1";}

        else if(marks >=41 && marks<=50)
        {grade = "D2";}

        else
        {grade = "E";}


        System.out.println(grade);
    }
}
