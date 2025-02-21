package com.LogicalPrograms;

public class PrimeNumber {
    //initialize a number to a variable
    //use boolean for setting condition
    //use for loop as we know initial and final value
    //can check prime number with 2 implementations
    //a- by taking 2 as initial and number-1 as final
    //b-by taking the math.sqrt(number)
    public static void main(String[] args){
        int a =258;
        boolean isPrime=true;

        for(int i=2;i<=Math.sqrt(a);i++);
        if(a%2==0){
            isPrime=false;
        }
        if(isPrime){
            System.out.println(a+"is prime number");
        }
        else{
            System.out.println(a+"is not a prime number");
        }
    }
}
