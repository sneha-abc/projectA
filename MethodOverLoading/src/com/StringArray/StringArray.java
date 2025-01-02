package com.StringArray;

public class StringArray {
    public static void main(String[] args) {
        String word = "Hello"; // Original word
        String reversedWord = "";

        // Loop through the string from the last character to the first
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord +=  word.toCharArray();
        }



        System.out.println(  reversedWord);
    }
}