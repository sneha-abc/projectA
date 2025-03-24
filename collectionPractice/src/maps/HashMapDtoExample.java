package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDtoExample {
    public static void main(String[] args) {
        Map<Object, CountryDto> map = new HashMap<>();

        System.out.println("To add the values and key=====================================");

        CountryDto c1 = new CountryDto("Afganistan", 122, 29121286, "Emir – Hibatullah Akhundzada");
        map.put(1, c1);
        CountryDto c2 = new CountryDto("Albania", 355, 2986952, " Bajram Begaj");
        map.put(2, c2);
        CountryDto c3 = new CountryDto("Algeria", 213, 34586184, " Abdelmadjid Tebboune");
        map.put(3, c3);
        CountryDto c4 = new CountryDto("American Samoa", 684, 57881, "Xavier Espot Zamora");
        map.put(4, c4);
        CountryDto c5 = new CountryDto("Andorra", 376, 84000, "Joan Enric Vives i Sicília");
        map.put(5, c5);
        CountryDto c6 = new CountryDto("Angola", 244, 13068161, "João Lourenço");
        map.put(6, c6);
        CountryDto c7 = new CountryDto("Anguilla", 264, 13254, "Gaston Browne");
        map.put(7, c7);
        CountryDto c8 = new CountryDto("Antarctica", 672, 0, "Xavier Espot Zamora");
        map.put(8, c8);
        CountryDto c9 = new CountryDto("Antigua and Barbuda", 268, 86754, "Charles");
        map.put(9, c9);
        CountryDto c10 = new CountryDto("Argentina", 54, 2766890, "Javier Milei");
        map.put(10, c10);
        CountryDto c11 = new CountryDto("Armenia", 374, 2968000, "Vahagn Khachaturyan");
        map.put(11, c11);
        CountryDto c12 = new CountryDto("Aruba", 297, 71566, "Javier Milei");
        map.put(12, c12);
        CountryDto c13 = new CountryDto("Australia", 61, 21515754, "Charles");
        map.put(13, c13);
        CountryDto c14 = new CountryDto("Austria", 43, 8205000, " Alexander Van der Bellen");
        map.put(14, c14);
        CountryDto c15 = new CountryDto("Azerbaijan", 994, 8303512, " Ilham Aliyev");
        map.put(15, c15);
        CountryDto c16 = new CountryDto("Bahamas", 242, 301790, "Charles");
        map.put(16, c16);
        CountryDto c17 = new CountryDto("Bahrain", 973, 738004, " Sheikh Hamad bin Isa Al Khalifa");
        map.put(17, c17);
        CountryDto c18 = new CountryDto("Bangladesh", 880, 156118464, "Shahabuddin Chuppu");
        map.put(18, c18);
        CountryDto c19 = new CountryDto("Barbados", 248, 285653, "SandraMason");
        map.put(19, c19);
        CountryDto c20 = new CountryDto("Belarus", 375, 9685000, "Alexandr Lukashenko");
        map.put(20, c20);

        System.out.println("printing values using key");
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4));
        System.out.println(map.get(5));
        System.out.println(map.get(6));
        System.out.println(map.get(7));
        System.out.println(map.get(8));
        System.out.println(map.get(9));
        System.out.println(map.get(10));
        System.out.println(map.get(11));
        System.out.println(map.get(12));
        System.out.println(map.get(13));
        System.out.println(map.get(14));
        System.out.println(map.get(15));
        System.out.println(map.get(16));
        System.out.println(map.get(17));
        System.out.println(map.get(18));
        System.out.println(map.get(19));
        System.out.println(map.get(20));

        System.out.println("To print the key=====================================");
        System.out.println(map.keySet());

        System.out.println("print using keyset=========================================================");
        Set<Object> keys = map.keySet();
        for (Object key : keys) {
            CountryDto countryDto = map.get(key);
            System.out.println(countryDto.getCountryCode());
            System.out.println(countryDto.getCountryName());
            System.out.println(countryDto.getPopulation());
            System.out.println(countryDto.getPresidentName());
        }
        System.out.println("print using for=========================================================");
        Set<Map.Entry<Object, CountryDto>> entry = map.entrySet();
        for (Map.Entry<Object, CountryDto> objectCountryDtoEntry : entry) {
            System.out.println(objectCountryDtoEntry.getKey());
            System.out.println(objectCountryDtoEntry.getValue().getCountryCode());
            System.out.println(objectCountryDtoEntry.getValue().getCountryName());
            System.out.println(objectCountryDtoEntry.getValue().getPopulation());
            System.out.println(objectCountryDtoEntry.getValue().getPresidentName());

        }

        System.out.println("print using iterator=========================================================");
        Iterator<Map.Entry<Object, CountryDto>> entry1 = entry.iterator();
        while (entry1.hasNext()) {
                Map.Entry<Object,CountryDto> countryDto  = entry1.next();
            System.out.println(countryDto.getKey());
            System.out.println(countryDto.getValue().getCountryCode());
            System.out.println(countryDto.getValue().getCountryName());
            System.out.println(countryDto.getValue().getPopulation());
            System.out.println(countryDto.getValue().getPresidentName());

        }

        System.out.println("To print the values=====================================");
        System.out.println(map.values());

        System.out.println("To clear the values=====================================");
        map.clear();
        System.out.println(map);
    }
}
