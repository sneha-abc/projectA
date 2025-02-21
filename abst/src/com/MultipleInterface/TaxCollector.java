package com.MultipleInterface;

public class TaxCollector implements StateTax, CentralTax{

    String government;

    public  TaxCollector(String government){
        this.government=government;
    }


    @Override
    public void serviceTax() {
        System.out.println("service tax collected by " + government);

    }

    @Override
    public void vehicalTax() {
        System.out.println("vehical tax collected by " + government);
    }

    @Override
    public void luxuryTax() {
        System.out.println("luxury tax collected by " + government);
    }

    @Override
    public void landRevenue() {
        System.out.println("Land Revenue tax collected by " + government);
    }

    @Override
    public void profession() {
        System.out.println("profession tax collected by " + government);

    }
}
