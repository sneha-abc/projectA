package com.ObjectClass;

public class BankDetails {

    private int accNo;
    private String accHolderName;

    public BankDetails(int accNo,String accHolderName){
        this.accHolderName=accHolderName;
        this.accNo=accNo;
    }

    @Override
    public String toString() {
        return "accNo is " +accNo+ "accountHolderName is" +accHolderName;
    }

    @Override
    public int hashCode() {
        return accNo;
    }

    public boolean equals(Object obj){
        if(obj==null)
        {
            return false;
        }

        if(obj instanceof BankDetails)
        {
            BankDetails bankDetails= (BankDetails) obj;
            if(this.accNo == bankDetails.accNo &&  this.accHolderName.equals(bankDetails.accHolderName))
            {
                return true;
            }
        }
        return false;
    }
}
