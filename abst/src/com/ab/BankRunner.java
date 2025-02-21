package com.ab;

public class BankRunner {

    public static void main(String[] args){

        System.out.println("SBI BANK");

        Bank sbiBank = new SbiBank();

        System.out.println(sbiBank.openAccount("sagara",12345));
        System.out.println(sbiBank.closeAccount(12345));
        System.out.println(sbiBank.deposit(12345,100));
        System.out.println(sbiBank.withdraw(12345,50));
        System.out.println(sbiBank.accountBalance(12345));

        System.out.println("HDFC BANK");

        Bank hdfcBank = new HdfcBank();

        System.out.println(hdfcBank.openAccount("haveri",78965));
        System.out.println(hdfcBank.closeAccount(78965));
        System.out.println(hdfcBank.deposit(78965,500));
        System.out.println(hdfcBank.withdraw(78965,200));
        System.out.println(hdfcBank.accountBalance(78965));


        System.out.println("ICSC BANK");

        Bank icscBank = new IcscBank();

        System.out.println(icscBank.openAccount("Shimoga",74125));
        System.out.println(icscBank.closeAccount(74125));
        System.out.println(icscBank.deposit(74125,200));
        System.out.println(icscBank.withdraw(74125,100));
        System.out.println(icscBank.accountBalance(74125));


        System.out.println("KARANATAKA BANK");

        Bank karanatakaBank = new IcscBank();

        System.out.println(karanatakaBank.openAccount("mysore",96385));
        System.out.println(karanatakaBank.closeAccount(96385));
        System.out.println(karanatakaBank.deposit(96385,300));
        System.out.println(karanatakaBank.withdraw(96385,200));
        System.out.println(karanatakaBank.accountBalance(96385));
    }

}
