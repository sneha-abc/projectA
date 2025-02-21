package com.ab;

public interface Atm {
    public abstract int createPin(int accNo,int pinCode);

    public abstract int changePin(int accNo,int pinCode);

    public abstract int withdraw(int pinCode,int cash);

    public abstract int deposit(int accNo,int pinCode,int cash);
}
