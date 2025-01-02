package com.inheritance;

public class District extends Karanataka{
    String districtName;

    public District(){
        System.out.println("non parameterized district class constructor");
    }

    public District(String districtName){
        System.out.println("parameterized district class constructor ");
        this.districtName=districtName;
    }
    public String getDistrictName(){
        return districtName;
    }

    public void pincode(){
        System.out.println("501100 ");

    }

    public static void main(String[] args){
        District dis = new District();
        District dis1 = new District("Haveri");
        System.out.println(dis1.getDistrictName());
        dis1.pincode();

        Karanataka kar = new Karanataka();
        Karanataka kar1 = new Karanataka("Bangalore");

        System.out.println(kar1.getStateCapital());
        kar1.population();

        Country co = new Country();
        Country co1 = new Country("India");
        System.out.println(co1.getCountryName());
        co1.population();
    }
}
