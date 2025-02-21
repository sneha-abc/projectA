package com.Exception;

public class Aadhar {
    int aadharNumber;

    public Aadhar(int AadharNumber){
        this.aadharNumber=AadharNumber;
    }

    public int getAadharNumber(){
        return aadharNumber;
    }

    public static void main(String[] args){

        System.out.println("Aadharnumber");
        int aadhar=123456;

        Aadhar aadhar1 = new Aadhar(147258);
try {
    if (aadhar1.getAadharNumber() == aadhar) {
        System.out.println("Aadhar is  matching");
        }
    else {
        throw new AadharNotFoundException("Aadhar is not matching");
    }
}
catch(AadharNotFoundException e){
    e.printStackTrace();
}
        {
            System.out.println("exception is handled");
        }
    }


}
