package com.inheritance;

public class Maharashtra extends Country {
    String stateCapital;

    public Maharashtra() {
        System.out.println("non parameterized Maharashtra Class constructor");

    }

    public Maharashtra(String stateCapital) {
        this.stateCapital = stateCapital;
    }

    public String getStateCapital() {
        return stateCapital;
    }

    public void population() {
        System.out.println("more than 10 k population");
    }

    public static void main(String[] args) {
        Maharashtra mah = new Maharashtra();
        Maharashtra mah1 = new Maharashtra("Mumbai");

        System.out.println(mah1.getStateCapital());
        mah1.population();

        Country co = new Country();
        Country co1 = new Country("India");
        System.out.println(co1.getCountryName());
        co1.population();

    }
}