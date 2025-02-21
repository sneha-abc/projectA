package com.Exception;

public class PinCode {
    int pinCode;

    public PinCode(int pinCode){
        this.pinCode=pinCode;
    }
    public int getPinCode(){
        return pinCode;
    }

    public static void main(String[] args)
    {

        PinCode pinCode1= new PinCode(200661);
        int actualpin=200660;
        if(pinCode1.getPinCode()==actualpin)
        {

                System.out.println("pinCode is matching");
        }
        else{
            throw new PinCodeNotCorrect(" pinCode is not matching");
        }
    }
}
