package com.xworks.logicalProgram;

public class AmstrongNumber {
    public static void main(String[] args) {
        int number=153;
        int sum=0;//to add the cube of every digit
        int n=number;//to compare the new value (sum of all digits) with the original number
        while(n!=0)//we will check weather n is 0 or not
        {
            int rem=n%10;// we get reminder by using modulus as 3 in 1st digit
                         // we get reminder by using modulus as 5 in 2nd digit
                         // we get reminder by using modulus as 1 in 3rd digit
            sum= sum+(rem*rem*rem);// 0+(3*3*3)=27
                                   // 27+(5*5*5)=125
                                   // 125+(1*1*1)=153
            n=n/10; // 153/10= q as 15
                    // 15/10= q as 1
                    // 1/10= q as 0
        }
        if(number==sum)
        {
            System.out.println(number + " is armstrong Number ");
        }

        else {
            System.out.println(number + "is not armstrong Number ");
        }
    }
}
