package com.OddEven;

public class Divide {

    public static void main(String[] args){
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<number.length;i++)
        {
            if(number[i]%3==0)
            {
                System.out.println("array index is " + i + " and divisible by 3 and it's value is " +number[i]);
            }
            if(number[i]%5==0)
            {
                System.out.println("array index is " + i + " and divisible by 5 and it's value is " +number[i]);
            }

        }

    }
}
