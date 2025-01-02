package com.inheritance;

public class Country {
    String countryName;

    public Country(){
        System.out.println("non parameterized country class constructor");
    }

    public Country(String countryName){
        this.countryName=countryName;
    }

    public String getCountryName(){
        return countryName;
    }
    public void population(){
        System.out.println("it has over 10 lakh of population");
    }
}

