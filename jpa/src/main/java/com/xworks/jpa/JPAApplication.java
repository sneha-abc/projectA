package com.xworks.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAApplication {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("java");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        FlightDto1 flightDto = new FlightDto1("PI01","vijay","male","indian","PI25");
        entityManager.merge(flightDto);
        entityTransaction.commit();
        entityManagerFactory.close();

    }
}
