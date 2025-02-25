package dto;

public class CountryDTO {

    private String countryName;
    private int countryCode;
    private  long population;
    private String PresidentName;

    public CountryDTO(){

    }
    public CountryDTO(String countryName, int countryCode, long population,String presidentName) {
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.population = population;
        PresidentName = presidentName;
    }

    @Override
    public String toString() {
        return "CountryDTO{" +
                "countryName='" + countryName + '\'' +
                ", countryCode=" + countryCode +
               ", PresidentName='" + PresidentName + '\'' +
                ", population=" + population +
                '}';
    }
}
