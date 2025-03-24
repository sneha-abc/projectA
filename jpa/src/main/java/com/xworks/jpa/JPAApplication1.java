package com.xworks.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Collection;


public class JPAApplication1 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("java");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();


        FlightDto1 passenger = new FlightDto1("PI30", "nidhi", "female", "indian", "FI30");
        entityManager.merge(passenger);
        Collection<FlightDto> flightDtos = FlightRunner.getPassenger();
        for (FlightDto DTO : flightDtos) {
            entityManager.merge(DTO);

        }

        transaction.commit();
        entityManagerFactory.close();

    }
}
