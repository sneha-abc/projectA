package lamda;

import dto.CountryDto;
import runner.CountryRunner;

import java.util.*;

public class StreamRunner {

    public static void main(String[] args) {


        Collection<CountryDto> countryDtos= CountryRunner.getCountries();



           countryDtos.stream().sorted().forEach(c-> System.out.println(c));

        Comparator<CountryDto> comparator=(c1,c2)->Long.compare(c1.getPopulation(),c2.getPopulation());

        countryDtos.stream().sorted(comparator).forEach(c-> System.out.println(c));
        System.out.println("****************");

        countryDtos
                .stream()
                .filter(c->c.getPopulation()<10000)
                .sorted()
                .forEach(c-> System.out.println(c));

        System.out.println("--------------");

        countryDtos.stream().filter(dto->dto.getCountryCode()==91).forEach(c-> System.out.println(c));

       /* Collections.sort((ArrayList)countryDtos);
        for(CountryDto c:countryDtos)
    {
        System.out.println(c);
    }

    //comparator
        System.out.println("===============================");
        Comparator<CountryDto> comparator=(c1,c2)->Long.compare(c1.getPopulation(),c2.getPopulation());

    Collections.sort((List)countryDtos,comparator);

        for(CountryDto c:countryDtos)
        {
            System.out.println(c);
        }



*/




    }

    public  static  String getName(){
        return  "sachin";
    }

}
