package com.ab;

public class AtmRunner {
    public static void main(String[] args){

        System.out.println("SBI ATM");

        Atm sbiAtm = new SbiAtm();

        System.out.println(sbiAtm.createPin(12345,10245));
        System.out.println(sbiAtm.changePin(12345,78965));
        System.out.println(sbiAtm.deposit(12345,78965,100));
        System.out.println(sbiAtm.withdraw(78965,50));


        System.out.println("HDFC ATM");

        Atm hdfcAtm = new HdfcAtm();

        System.out.println(hdfcAtm.createPin(54321,12457));
        System.out.println(hdfcAtm.changePin(54321,96385));
        System.out.println(hdfcAtm.deposit(54321,96385,200));
        System.out.println(hdfcAtm.withdraw(96385,50));

        System.out.println("ICSC ATM");

        Atm icscAtm = new IcscAtm();

        System.out.println(icscAtm.createPin(25896,35967));
        System.out.println(icscAtm.changePin(25896,35748));
        System.out.println(icscAtm.deposit(25896,35748,400));
        System.out.println(icscAtm.withdraw(35748,900));


        System.out.println("KARANATAKA ATM");

        Atm karanataAtm = new KaranatakaAtm();

        System.out.println(karanataAtm.createPin(98510,65941));
        System.out.println(karanataAtm.changePin(98510,78401));
        System.out.println(karanataAtm.deposit(98510,78401,600));
        System.out.println(karanataAtm.withdraw(78401,1000));



    }

}
