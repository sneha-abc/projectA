package com.ab;

public class SbiAtm implements Atm{
    int pinCode;
    int newPin=78965;
    int accNo=12345;
    int amount=500;


    @Override
    public int createPin(int accNo, int pinCode) {
        if(this.accNo==accNo){
            System.out.println("pin code is generated successfully in SBI Bank");
        }

        return pinCode;
    }

    @Override
    public int changePin(int accNo, int pinCode) {
        if(this.accNo==accNo){
            pinCode=newPin;
            System.out.println("pinCode changed successfully in SBI ATM");
        }
        return pinCode;
    }
    @Override
    public int deposit(int accNo, int pin, int cash) {
        if(this.accNo==accNo){
            System.out.println("Cash deposited in SBI atm");
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
