package com.xworks.jpaOperation;

import java.util.List;

public interface CountryDao {
    CountryDto saveCountry(CountryDto countryDto);//insert

    int getCountryNameByCountryCode(int country_code);//fetch

    int getPresidentNameByCountryCode(int country_code);//fetch

    void updatePresidentName(CountryDto countryDto,int country_code);//update

    void deleteCountry(int country_code);//delete

    void getCountryNames();//fetch

    List<Object> getAllCountryNameAndPresidentName();//fetch

    void getAllCountryNameAndPresidentNameByCountryCode(int country_code);//fetch
}
