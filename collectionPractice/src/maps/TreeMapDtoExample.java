package maps;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDtoExample {
    public static void main(String[] args) {
        Map<CountryDto, DetailsDto> map = new TreeMap<>();

        CountryDto c1 = new CountryDto("Afganistan", 122, 29121286, "Emir – Hibatullah Akhundzada");
        DetailsDto d1 = new DetailsDto(20, 21, 2);
        map.put(c1, d1);

        CountryDto c2 = new CountryDto("Albania", 355, 2986952, " Bajram Begaj");
        DetailsDto d2 = new DetailsDto(15, 11, 3);
        map.put(c2, d2);

        CountryDto c3 = new CountryDto("Algeria", 213, 34586184, " Abdelmadjid Tebboune");
        DetailsDto d3 = new DetailsDto(18, 12, 4);
        map.put(c3, d3);

        CountryDto c4 = new CountryDto("American Samoa", 684, 57881, "Xavier Espot Zamora");
        DetailsDto d4 = new DetailsDto(20, 13, 5);
        map.put(c4, d4);

        CountryDto c5 = new CountryDto("Andorra", 376, 84000, "Joan Enric Vives i Sicília");
        DetailsDto d5 = new DetailsDto(21, 14, 6);
        map.put(c5, d5);

        CountryDto c6 = new CountryDto("Angola", 244, 13068161, "João Lourenço");
        DetailsDto d6 = new DetailsDto(22, 12, 7);
        map.put(c6, d6);

        CountryDto c7 = new CountryDto("Anguilla", 264, 13254, "Gaston Browne");
        DetailsDto d7 = new DetailsDto(23, 15, 8);
        map.put(c7, d7);

        CountryDto c8 = new CountryDto("Antarctica", 672, 0, "Xavier Espot Zamora");
        DetailsDto d8 = new DetailsDto(24, 45, 9);
        map.put(c8, d8);

        CountryDto c9 = new CountryDto("Antigua and Barbuda", 268, 86754, "Charles");
        DetailsDto d9 = new DetailsDto(25, 15, 10);
        map.put(c9, d9);

        CountryDto c10 = new CountryDto("Argentina", 54, 2766890, "Javier Milei");
        DetailsDto d10 = new DetailsDto(26, 25, 11);
        map.put(c10, d10);

        CountryDto c11 = new CountryDto("Armenia", 374, 2968000, "Vahagn Khachaturyan");
        DetailsDto d11 = new DetailsDto(27, 30, 12);
        map.put(c11, d11);

        CountryDto c12 = new CountryDto("Aruba", 297, 71566, "Javier Milei");
        DetailsDto d12 = new DetailsDto(28, 25, 13);
        map.put(c12, d12);

        CountryDto c13 = new CountryDto("Australia", 61, 21515754, "Charles");
        DetailsDto d13 = new DetailsDto(29, 20, 4);
        map.put(c13, d13);

        CountryDto c14 = new CountryDto("Austria", 43, 8205000, " Alexander Van der Bellen");
        DetailsDto d14 = new DetailsDto(30, 15, 6);
        map.put(c14, d14);

        CountryDto c15 = new CountryDto("Azerbaijan", 994, 8303512, " Ilham Aliyev");
        DetailsDto d15 = new DetailsDto(10, 10, 8);
        map.put(c15, d15);

        CountryDto c16 = new CountryDto("Bahamas", 242, 301790, "Charles");
        DetailsDto d16 = new DetailsDto(11, 50, 1);
        map.put(c16, d16);

        CountryDto c17 = new CountryDto("Bahrain", 973, 738004, " Sheikh Hamad bin Isa Al Khalifa");
        DetailsDto d17 = new DetailsDto(12, 40, 4);
        map.put(c17, d17);

        CountryDto c18 = new CountryDto("Bangladesh", 880, 156118464, "Shahabuddin Chuppu");
        DetailsDto d18 = new DetailsDto(40, 30, 3);
        map.put(c18, d18);

        CountryDto c19 = new CountryDto("Barbados", 248, 285653, "SandraMason");
        DetailsDto d19 = new DetailsDto(30, 20, 5);
        map.put(c19, d19);

        CountryDto c20 = new CountryDto("Belarus", 375, 9685000, "Alexandr Lukashenko");
        DetailsDto d20 = new DetailsDto(32, 10, 6);
        map.put(c20, d20);

        System.out.println(map);

        System.out.println("To print the value using key=====================================");
        Set<CountryDto> keys = map.keySet();
        for (CountryDto key : keys) {
            System.out.println(map.get(key));
            System.out.println(key.getCountryCode());
            System.out.println(key.getCountryName());
            System.out.println(key.getPopulation());
            System.out.println(key.getPresidentName());
            System.out.println(key.getCountryName() + "Number_of_states" + map.get(key).getNumber_of_states() + "Number_of_rivers " + map.get(key).getNumber_of_rivers() + "number_of_tourist " + map.get(key).number_of_tourit_place());
        }
        System.out.println("print using for=========================================================");
        Set<Map.Entry<CountryDto, DetailsDto>> entry = map.entrySet();
        for (Map.Entry<CountryDto, DetailsDto> cd : entry) {
            System.out.println(cd.getKey().getCountryCode());
            System.out.println(cd.getKey().getCountryName());
            System.out.println(cd.getKey().getPresidentName());
            System.out.println(cd.getKey().getPopulation() + "Number_of_states" + cd.getValue().getNumber_of_states() + "Number_of_rivers " + cd.getValue().getNumber_of_rivers() + "number_of_tourist " + cd.getValue().number_of_tourit_place());
        }

        System.out.println("print using iterator=========================================================");
        Iterator<Map.Entry<CountryDto, DetailsDto>> entry1 = entry.iterator();
        while (entry1.hasNext()) {
            Map.Entry<CountryDto,DetailsDto> dtos= entry1.next();
            System.out.println(dtos.getKey().getCountryCode());
            System.out.println(dtos.getKey().getCountryName());
            System.out.println(dtos.getKey().getPresidentName());
            System.out.println(dtos.getKey().getPopulation() + "Number_of_states" + dtos.getValue().getNumber_of_states() + "Number_of_rivers " + dtos.getValue().getNumber_of_rivers() + "number_of_tourist " + dtos.getValue().number_of_tourit_place());
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
