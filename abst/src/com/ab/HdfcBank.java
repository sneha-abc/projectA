package com.ab;

public class HdfcBank implements Bank{
    String branchName;
    int accNo;
    int balanceAmount;


    @Override
    public String openAccount(String branchName, int accNo) {
        System.out.println("HDFC account is created successfully");
        this.branchName=branchName;
        this.accNo=accNo;
        return "HDFC branch name-"+branchName+"HDFC accNO-"+accNo;
    }

    @Override
    public String closeAccount(int accNo) {
        if(this.accNo==accNo){
            System.out.println("HDFC account is closed successfully");
        }
        else{
            System.out.println("entered incorrect account number ");
        }
        return "HDFC  closed successfully";
    }

    @Override
    public int deposit(int accNo, int amount) {
        if(this.accNo==accNo){
            balanceAmount=balanceAmount+amount;
            System.out.println("amount deposited in account successfully");
        }
        else{
            System.out.println("in correct account number");
        }
        return balanceAmount;
    }

    @Override
    public int withdraw(int accNo, int money) {
        if(this.accNo==accNo){
            if(balanceAmount>=money){
                balanceAmount=balanceAmount-money;
                System.out.println("withdraw done successfully");
            }
            else{
                System.out.println("withdraw failed ");
            }
        }
        return money;
    }

    @Override
    public int accountBalance(int accNo) {
        if(this.accNo==accNo){
            System.out.println("your balance-"+balanceAmount);
        }
        else{
            System.out.println("incorrect account number");
        }
        return balanceAmount;
    }
}
