package com.xworks.jpa;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PassengerInfo")

public class FlightDto {

    @Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="passenger_id")
    private String passenger_Id;
    private String passenger_Name;
    private String gender;
    private String nationality;
    private String flight_Id;

    public FlightDto(){

    }

    public FlightDto(String passengerId, String passengerName, String gender, String nationality, String flightId) {
        this.passenger_Id = passengerId;
        this.passenger_Name = passengerName;
        this.gender = gender;
        this.nationality = nationality;
        this.flight_Id = flightId;
    }

    public String getPassengerId() {
        return passenger_Id;
    }

    public void setPassengerId(String passengerId) {
        this.passenger_Id = passengerId;
    }

    public String getPassengerName() {
        return passenger_Name;
    }

    public void setPassengerName(String passengerName) {
        this.passenger_Name = passengerName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFlightId() {
        return flight_Id;
    }

    public void setFlightId(String flightId) {
        this.flight_Id = flightId;
    }
}
