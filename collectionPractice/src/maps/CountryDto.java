package maps;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountryDto implements Serializable,Comparable {
    private int country_code;
    private String country_name;
    private long population;
    private String president_name;

    public CountryDto() {
    }

    public CountryDto(String countryName, int countryCode, long population,String presidentName) {
        this.country_name = countryName;
        this.country_code = countryCode;
        this.population = population;
        this.president_name=presidentName;
    }

    public String getCountryName() {
        return country_name;
    }

    public void setCountryName(String countryName) {
        this.country_name = countryName;
    }

    public int getCountryCode() {
        return country_code;
    }

    public void setCountryCode(int countryCode) {
        this.country_code = countryCode;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getPresidentName() {
        return president_name;
    }

    public void setPresidentName(String presidentName) {
        this.president_name = presidentName;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
