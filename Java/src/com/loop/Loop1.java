package com.loop;

public class Loop1 {
    public static void main(String[] args) {

        boolean exampassed=true;
        boolean haveseventyFivePersentAttendence = true;

        // Corrected comparison
        if (exampassed!=true  && haveseventyFivePersentAttendence!=false)
        {
            System.out.println("passed the semester");
        }else{
            System.out.println("failed the semester");
        }
    }
}
