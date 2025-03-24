package com.xworks.jdbc;


public class FlightDto {
    private String passengerId;
    private String passengerName;
    private String gender;
    private String nationality;
    private String flightId;

    public FlightDto(){

    }

    public FlightDto(String passengerId, String passengerName, String gender, String nationality, String flightId) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.gender = gender;
        this.nationality = nationality;
        this.flightId = flightId;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
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
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }


    }

