package maps;

public class DetailsDto {
    private int number_of_states;
    private int number_of_tourit_place;
    private int number_of_rivers;

    public DetailsDto(){

    }
    public DetailsDto(int number_of_states, int number_of_tourit_place, int number_of_rivers) {
        this.number_of_states = number_of_states;
        this.number_of_tourit_place = number_of_tourit_place;
        this.number_of_rivers = number_of_rivers;
    }

    public int getNumber_of_states() {
        return number_of_states;
    }

    public void setNumber_of_states(int number_of_states) {
        this.number_of_states = number_of_states;
    }

    public long number_of_tourit_place() {
        return number_of_tourit_place;
    }

    public void number_of_tourit_place(int number_of_tourit_place) {
        this.number_of_tourit_place = number_of_tourit_place;
    }

    public int getNumber_of_rivers() {
        return number_of_rivers;
    }

    public void setNumber_of_rivers(int number_of_rivers) {
        this.number_of_rivers = number_of_rivers;
    }
}
