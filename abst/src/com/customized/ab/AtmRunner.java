package com.customized.ab;

public class AtmRunner {
    public static void main(String[] args) {
        System.out.println("SBI bank");
        Atmdto atm = new Atmdto();
        atm.setName("sneha");
        atm.setBalance(50000);
        atm.setAtmNo(12345);
        atm.setAccNo(852963);
        atm.setPin(4563);
        atm.setDateOfBirth("25/03/2002");

        Atm runner=new SbiAtm();
        System.out.println(runner.details(atm));
        System.out.println(runner.createPin(852963,4563));
        System.out.println(runner.changePin(852963,1245) );
        System.out.println(runner.withdraw(1245,15000));
        System.out.println(runner.deposit(852963,1245,2000));
        System.out.println(Atm.cardlessTransaction(1245,3000));

        System.out.println("canara bank");
        Atmdto atm1 = new Atmdto();
        atm1.setName("sagar");
        atm1.setBalance(150000);
        atm1.setAtmNo(3596482);
        atm1.setAccNo(85216349);
        atm1.setPin(6203);
        atm1.setDateOfBirth("15/11/2000");

        Atm runner1=new CanaraAtm();
        System.out.println(runner1.details(atm1));
        System.out.println(runner1.createPin(85216349,6203));
        System.out.println(runner1.changePin(85216349,96385) );
        System.out.println(runner1.withdraw(96385,3000));
        System.out.println(runner1.deposit(85216349,96385,2000));


        System.out.println("HDFC bank");
        Atmdto atm2 = new Atmdto();
        atm2.setName("sujay");
        atm2.setBalance(50000);
        atm2.setAtmNo(4567286);
        atm2.setAccNo(1025876);
        atm2.setPin(2523);
        atm2.setDateOfBirth("14/12/2012");

        Atm runner2=new HDFCAtm();
        System.out.println(runner2.details(atm2));
        System.out.println(runner2.createPin(1025876,2523));
        System.out.println(runner2.changePin(1025876,6547) );
        System.out.println(runner2.withdraw(6547,5000));
        System.out.println(runner2.deposit(1025876,6547,4500));

        System.out.println("idfc bank");
        Atmdto atm3 = new Atmdto();
        atm3.setName("rohit");
        atm3.setBalance(10000);
        atm3.setAtmNo(75394682);
        atm3.setAccNo(123456789);
        atm3.setPin(1234);
        atm3.setDateOfBirth("13/10/2001");

        Atm runner3=new IDFCAtm();
        System.out.println(runner3.details(atm3));
        System.out.println(runner3.createPin(123456789,1234));
        System.out.println(runner3.changePin(123456789,9852) );
        System.out.println(runner3.withdraw(9852,500));
        System.out.println(runner3.deposit(123456789,9852,100));


    }
}
