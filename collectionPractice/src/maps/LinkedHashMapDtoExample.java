package maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDtoExample {
    public static void main(String[] args) {
        Map<CountryDto,Object> map= new LinkedHashMap<>();
        System.out.println("To add the values and key=====================================");

        CountryDto c1 = new CountryDto("Afganistan", 122, 29121286, "Emir – Hibatullah Akhundzada");
        map.put( c1,1);
        CountryDto c2 = new CountryDto("Albania", 355, 2986952, " Bajram Begaj");
        map.put(  c2,2);
        CountryDto c3 = new CountryDto("Algeria", 213, 34586184, " Abdelmadjid Tebboune");
        map.put(  c3,3);
        CountryDto c4 = new CountryDto("American Samoa", 684, 57881, "Xavier Espot Zamora");
        map.put( c4,4);
        CountryDto c5 = new CountryDto("Andorra", 376, 84000, "Joan Enric Vives i Sicília");
        map.put( c5,5);
        CountryDto c6 = new CountryDto("Angola", 244, 13068161, "João Lourenço");
        map.put( c6,6);
        CountryDto c7 = new CountryDto("Anguilla", 264, 13254, "Gaston Browne");
        map.put(c7,7);
        CountryDto c8 = new CountryDto("Antarctica", 672, 0, "Xavier Espot Zamora");
        map.put(  c8,8);
        CountryDto c9 = new CountryDto("Antigua and Barbuda", 268, 86754, "Charles");
        map.put( c9,9);
        CountryDto c10 = new CountryDto("Argentina", 54, 2766890, "Javier Milei");
        map.put(  c10,10);
        CountryDto c11 = new CountryDto("Armenia", 374, 2968000, "Vahagn Khachaturyan");
        map.put(  c11,11);
        CountryDto c12 = new CountryDto("Aruba", 297, 71566, "Javier Milei");
        map.put(  c12,12);
        CountryDto c13 = new CountryDto("Australia", 61, 21515754, "Charles");
        map.put( c13,13);
        CountryDto c14 = new CountryDto("Austria", 43, 8205000, " Alexander Van der Bellen");
        map.put(  c14,14);
        CountryDto c15 = new CountryDto("Azerbaijan", 994, 8303512, " Ilham Aliyev");
        map.put(  c15,15);
        CountryDto c16 = new CountryDto("Bahamas", 242, 301790, "Charles");
        map.put( c16,16);
        CountryDto c17 = new CountryDto("Bahrain", 973, 738004, " Sheikh Hamad bin Isa Al Khalifa");
        map.put( c17,17);
        CountryDto c18 = new CountryDto("Bangladesh", 880, 156118464, "Shahabuddin Chuppu");
        map.put( c18,18);
        CountryDto c19 = new CountryDto("Barbados", 248, 285653, "SandraMason");
        map.put(  c19,19);
        CountryDto c20 = new CountryDto("Belarus", 375, 9685000, "Alexandr Lukashenko");
        map.put( c20,20);

        System.out.println(map);

        System.out.println("To print the value using key=====================================");
        Set<CountryDto> keys = map.keySet();
        for (CountryDto key : keys) {
            System.out.println(key.getCountryCode() + "value is " + map.get(key));
            System.out.println(key.getCountryName() + "value is " + map.get(key));
            System.out.println(key.getPopulation() + "value is " + map.get(key));
            System.out.println(key.getPresidentName() + "value is " + map.get(key));

        }

        System.out.println("print using for=========================================================");
        Set<Map.Entry<CountryDto,Object>> entry = map.entrySet();
        for (Map.Entry<CountryDto, Object> c : entry) {
            System.out.println(c.getKey().getCountryCode() + "value is " + c.getValue());
            System.out.println(c.getKey().getCountryName()+ "value is " + c.getValue());
            System.out.println(c.getKey().getPopulation() + "value is " + c.getValue());
            System.out.println(c.getKey().getPresidentName() + "value is " + c.getValue());


        }
        System.out.println("print using iterator=========================================================");
        Iterator<Map.Entry<CountryDto,Object>> entry1 = entry.iterator();
        while(entry1.hasNext()){
            Map.Entry<CountryDto,Object> countryDto = entry1.next();
            System.out.println(countryDto.getKey().getCountryCode() + "value is " + countryDto.getValue());
            System.out.println(countryDto.getKey().getCountryName() + "value is " + countryDto.getValue());
            System.out.println(countryDto.getKey().getPopulation() + "value is " + countryDto.getValue());
            System.out.println(countryDto.getKey().getPresidentName() + "value is " + countryDto.getValue());

        }

        System.out.println("To print the key=====================================");
        System.out.println(map.keySet());

        System.out.println("To print the values=====================================");
        System.out.println(map.values());

        System.out.println("To clear the values=====================================");
        map.clear();
        System.out.println(map);

    }
}
