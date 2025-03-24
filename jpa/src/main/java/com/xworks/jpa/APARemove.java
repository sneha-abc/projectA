package com.xworks.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class APARemove {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("java");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        FlightDto flightDto1= entityManager.find(FlightDto.class,"PI16");

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.remove(flightDto1);

        transaction.commit();
    }
}
