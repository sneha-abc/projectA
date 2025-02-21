package com.ab;

public interface Bank {
    public abstract String openAccount( String branchName , int accNo);

    public abstract String closeAccount(int accNo);

    public abstract int deposit(int accNo , int ammount );

    public abstract int withdraw(int accNo , int money);

    public abstract  int accountBalance(int accNo );
}
