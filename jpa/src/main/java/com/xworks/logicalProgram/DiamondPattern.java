package com.xworks.logicalProgram;

public class DiamondPattern {
    public static void main(String[] args) {
        int number = 5;
        int m , n;
        for (m = 1; m <= number; m++) {//1st half

            for (n = 1; n <= number - m; n++) {//for space
                System.out.print(" ");
            }

            for (n = 1; n <= m * 2 - 1; n++) {//to print star
                System.out.print("*");
            }

            System.out.println();
        }

        for (m = number - 1; m > 0; m--) {//secound half

            for (n = 1; n <= number - m; n++) {//for space
                System.out.print(" ");
            }

            for (n = 1; n <= m * 2 - 1; n++) {//for print star
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
