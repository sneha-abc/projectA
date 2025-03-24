package com.xworks.jpaOperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Collection;

public class JPAApplicationInsert {
    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();

        Collection<CountryDto> countryDtos = CountriesRunner.getCountry();
        for (CountryDto countryDto : countryDtos) {

            entityManger.merge(countryDto);

        }
        transaction.commit();
        entityMangerFactory.close();
    }
}
