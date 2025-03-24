package com.xworks.jpaOperation.service;

import com.xworks.jpaOperation.CountryDaoImpli;
import com.xworks.jpaOperation.CountryDto;

import java.util.Collections;
import java.util.List;
//service layer/business layer
public class ServiceImpliments implements Service{
    CountryDaoImpli countryDaoImpli=new CountryDaoImpli();
    @Override
    public CountryDto saveCountry(CountryDto countryDto) {
//        if (countryDto!=null&&countryDto.getCountryCode()>0&&countryDto.getCountryName()!=null&&
//                countryDto.getPresidentName()!=null&&countryDto.getPopulation()>0)
//        {
//            return countryDaoImpli.saveCountry(countryDto);
//        }
        if(countryDto!=null)
        {
            boolean flag=false;
            if(countryDto.getCountryCode()<=0)
            {
                System.out.println("country code is not correct");
                flag= true;
            }
            else if(countryDto.getCountryName()==null)
            {
                System.out.println("country name is not correct");
                flag= true;
            }
            else if(countryDto.getCountryName()=="" && countryDto.getCountryName().isEmpty())
            {
                System.out.println("country name is not correct");
                flag= true;
            }
            else if(countryDto.getPresidentName()==null)
            {
                System.out.println("president name is not correct");
                flag= true;
            }
            else if(countryDto.getPresidentName()=="" && countryDto.getPresidentName().isEmpty())
            {
                System.out.println("president name is not correct");
                flag= true;
            }
            else if(countryDto.getPopulation()<=0)
            {
                System.out.println("population is not correct");
                flag= true;
            }

            if(flag==false)
            {
                return countryDaoImpli.saveCountry(countryDto);
            }
        }
        System.out.println("values are not correct");
        return null;
    }

    @Override
    public int getCountryNameByCountryCode(int country_code) {
        if(country_code>0)
        {
//            System.out.println("method getCountryNameByCountryCode  ");
            System.out.println("country code is  correct");
            return countryDaoImpli.getCountryNameByCountryCode(country_code);
        }
        System.out.println("country code is not correct");
        return 0;
    }

    @Override
    public int getPresidentNameByCountryCode(int country_code) {
        if(country_code>0)
        {
//            System.out.println("method getPresidentNameByCountryCode");
            System.out.println("country code is  correct");
            return countryDaoImpli.getPresidentNameByCountryCode(country_code);
        }
        System.out.println("country code is not correct");
        return 0;
    }

    @Override
    public void updatePresidentName(CountryDto countryDto, int country_code) {
        if(country_code>0)
        {
//            System.out.println("method updatePresidentName");
            System.out.println("country code is  correct");
            countryDaoImpli.updatePresidentName(countryDto,country_code);
        }
        else {
            System.out.println("country code is not correct");
        }

    }

    @Override
    public void deleteCountry(int country_code) {
        if(country_code>0)
        {
//            System.out.println("method deleteCountry");
            System.out.println("country code is  correct");
            countryDaoImpli.deleteCountry(country_code);
        }
        else {
            System.out.println("country code is not correct");
        }

    }

    @Override
    public void getCountryNames() {
//        System.out.println("method getCountryNames");
       countryDaoImpli.getCountryNames();
    }

    @Override
    public List<Object> getAllCountryNameAndPresidentName() {
//        System.out.println("method getAllCountryNameAndPresidentName");
        countryDaoImpli.getAllCountryNameAndPresidentName();
        return Collections.emptyList();
    }

    @Override
    public void getAllCountryNameAndPresidentNameByCountryCode(int country_code) {
        if(country_code>0)
        {
//            System.out.println("method getAllCountryNameAndPresidentNameByCountryCode");
            System.out.println("country code is  correct");
            countryDaoImpli.getAllCountryNameAndPresidentNameByCountryCode(country_code);
        }
        else {
            System.out.println("country code is not correct");
        }

    }
}
