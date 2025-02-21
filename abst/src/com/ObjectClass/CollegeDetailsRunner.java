package com.ObjectClass;

import java.sql.SQLOutput;

public class CollegeDetailsRunner {

    public static void main(String[] args){


        CollegeDetails collegeDetails=new CollegeDetails(1,"JNNCE");
        System.out.println(collegeDetails.toString());
        System.out.println(collegeDetails.hashCode());

        CollegeDetails collegeDetails1=new CollegeDetails(2,"BMSE");
        System.out.println(collegeDetails1.toString());
        System.out.println(collegeDetails1.hashCode());

        CollegeDetails collegeDetails3=new CollegeDetails(1,"JNNCE");
        System.out.println(collegeDetails3==collegeDetails3);
        System.out.println(collegeDetails3.equals(collegeDetails3));





    }
}
