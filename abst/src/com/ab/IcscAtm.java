package com.ab;

public class IcscAtm implements Atm{
    int pinCode;
    int newPin=35748;
    int accNo=25896;
    int amount=500;


    @Override
    public int createPin(int accNo, int pinCode) {
        if(this.accNo==accNo){
            System.out.println("pin code is generated successfully in ICSC atm");
        }

        return pinCode;
    }

    @Override
    public int changePin(int accNo, int pinCode) {
        if(this.accNo==accNo){
            pinCode=newPin;
            System.out.println("pinCode changed successfully in ICSC atm");
        }
        return pinCode;
    }
    @Override
    public int deposit(int accNo, int pin, int cash) {
        if(this.accNo==accNo){
            System.out.println("Cash deposited in ICSC atm");
            amount=amount+cash;
        }
        else{
            System.out.println("invalid account number");
        }
        return amount;
    }

    @Override
    public int withdraw(int pinCode, int cash) {
        if(amount>=cash){
            System.out.println("withdraw successfully");
            amount=amount-cash;

        }
        else{
            System.out.println("insufficient balance");
        }
        return cash;
    }

}
