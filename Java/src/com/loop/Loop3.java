package com.loop;

public class Loop3 {
    public static void main(String[] args) {
        boolean passedMath = true;
        boolean passedScience = false;
        boolean passedEnglish = true;

        if (passedMath && passedScience  && passedEnglish) {

            System.out.println("You passed all subjects");

        } else if (passedMath && passedScience) {

            System.out.println("You passed Math and Science");

        } else if (passedMath && passedEnglish) {

            System.out.println("You passed Math and English");

        } else if (passedScience && passedEnglish) {

            System.out.println("You passed Science and English");

        } else {

            System.out.println("You need to improve");
        }
    }
}
