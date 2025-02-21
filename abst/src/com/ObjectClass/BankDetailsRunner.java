package com.ObjectClass;

public class BankDetailsRunner {
    public static void main(String[] args){


        BankDetails bankDetails1 = new BankDetails(123,"sneha");
        System.out.println(bankDetails1.toString());
        System.out.println(bankDetails1.hashCode());

        BankDetails bankDetails2 = new BankDetails(456,"sagar");
        System.out.println(bankDetails2.toString());
        System.out.println(bankDetails2.hashCode());

        BankDetails bankDetails3 =new BankDetails(123,"sneha");
        System.out.println(bankDetails3.toString());
        System.out.println(bankDetails3.hashCode());


        System.out.println(bankDetails1==bankDetails2);//checking the reference
        System.out.println(bankDetails1.equals(bankDetails3));//checking the value

    }
}
