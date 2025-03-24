package com.xworks.jpaOperation;

import com.xworks.jpaOperation.service.ServiceImpliments;

public class CountryDaoRunner {
    public static void main(String[] args) {
        ServiceImpliments service = new ServiceImpliments();

//        CountryDto countryDto= new CountryDto("bharataaaa",18963,46446844,"sagar");
//        service.saveCountry(countryDto);
 
        System.out.println("================================================");

        service.getCountryNameByCountryCode(5);

        System.out.println("===============================================");

        //service.deleteCountry(10);

        System.out.println("==============================");

        service.getCountryNames();

        System.out.println("============================================");
        service.getPresidentNameByCountryCode(2);

        System.out.println("=============================================");

        CountryDto countryDto1=new CountryDto();

        service.updatePresidentName(countryDto1,4);

        System.out.println("========================================================================");

        service.getAllCountryNameAndPresidentNameByCountryCode(15);

        System.out.println("========================================================================");


        service.getAllCountryNameAndPresidentName();

        System.out.println("====================================");



    }
}
