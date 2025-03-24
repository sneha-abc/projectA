package com.xworks.jpaOperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAApplicationDelete {
    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        CountryDto country = entityManger.find(CountryDto.class, 9);
        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        entityManger.remove(country);
        transaction.commit();



        entityManger.close();
    }
}
