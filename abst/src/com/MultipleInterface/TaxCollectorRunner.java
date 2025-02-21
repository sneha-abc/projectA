package com.MultipleInterface;

public class TaxCollectorRunner {

    public static void main(String[] args){

        StateTax stateTax = new TaxCollector("State government");
        stateTax.luxuryTax();
        stateTax.landRevenue();
        stateTax.profession();

        TaxCollector tc = (TaxCollector) stateTax;//methods of central tax is not present in state tax  so doing down casting
        tc.serviceTax();
        tc.vehicalTax();

        CentralTax centralTax = new TaxCollector("central government");
        centralTax.serviceTax();
        centralTax.vehicalTax();
        centralTax.luxuryTax();

        TaxCollector tc1 = (TaxCollector) centralTax;//methods of state tax is not present in central tax  so doing down casting
        tc1.landRevenue();
        tc1.profession();
    }
}
