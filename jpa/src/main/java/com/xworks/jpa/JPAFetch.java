package com.xworks.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAFetch {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("java");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        FlightDto flightDto1 = entityManager.find(FlightDto.class ,"PI20");

        System.out.println( flightDto1.getFlightId());
        System.out.println(flightDto1.getPassengerName());
        System.out.println(flightDto1.getGender());
        System.out.println(flightDto1.getNationality());
        System.out.println(flightDto1.getPassengerId());

    }
}
