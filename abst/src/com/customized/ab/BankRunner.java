package com.customized.ab;

public class BankRunner {
    public static void main(String[] args)
    {
        System.out.println("SBI bank");
        Bankdto dto=new Bankdto();
        dto.setName("sneha");
        dto.setAddress("haveri");
        dto.setBalance(10000);
        dto.setIfsc("SBI155652");
        dto.setAccNo(123456);
        dto.setDateOfBirth("02/10/2000");

        Bank sbi=new SbiBank();
        System.out.println(sbi.createAccount(dto));
        System.out.println(sbi.deposit(123456,5000));
        System.out.println(sbi.balance(123456));
        System.out.println(sbi.withdraw(123456,1000));
        System.out.println(sbi.closeAccount(123456));
        System.out.println(sbi.withdrawUsingUpi(123456,3000));


        System.out.println("canara bank");
        Bankdto dto1=new Bankdto();
        dto1.setName("sujay");
        dto1.setAddress("mysore");
        dto1.setBalance(30000);
        dto1.setIfsc("SBI789452");
        dto1.setAccNo(78945);
        dto1.setDateOfBirth("16/08/2002");

        Bank canara=new CanaraBank();
        System.out.println(canara.createAccount(dto1));
        System.out.println(canara.deposit(78945,4000));
        System.out.println(canara.balance(78945));
        System.out.println(canara.withdraw(78945,2000));
        System.out.println(canara.closeAccount(78945));

        System.out.println("hdfc bank");
        Bankdto dto2=new Bankdto();
        dto2.setName("sagar");
        dto2.setAddress("bangalore");
        dto2.setBalance(40000);
        dto2.setIfsc("SBI147852");
        dto2.setAccNo(456123);
        dto2.setDateOfBirth("28/05/2005");

        Bank hdfc=new HDFCBank();
        System.out.println(hdfc.createAccount(dto2));
        System.out.println(hdfc.deposit(456123,1000));
        System.out.println(hdfc.balance(456123));
        System.out.println(hdfc.withdraw(456123,3500));
        System.out.println(hdfc.closeAccount(456123));

        System.out.println("idfc bank");
        Bankdto dto3=new Bankdto();
        dto3.setName("rohit");
        dto3.setAddress("haveri");
        dto3.setBalance(50000);
        dto3.setIfsc("SBI95862");
        dto3.setAccNo(357918);
        dto3.setDateOfBirth("23/03/2000");

        Bank idfc=new IDFCBank();
        System.out.println(idfc.createAccount(dto3));
        System.out.println(idfc.deposit(357918,1500));
        System.out.println(idfc.balance(357918));
        System.out.println(idfc.withdraw(357918,2500));
        System.out.println(idfc.closeAccount(357918));


    }
}
