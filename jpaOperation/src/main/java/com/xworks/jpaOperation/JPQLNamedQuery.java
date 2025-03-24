package com.xworks.jpaOperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class JPQLNamedQuery {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        Query q1 = entityManager.createNamedQuery("query1");
        List<CountryDto> result = q1.getResultList();
        for (CountryDto countryDto : result) {
            System.out.println(countryDto.getCountryCode());
            System.out.println(countryDto.getCountryName());
            System.out.println(countryDto.getPopulation());
            System.out.println(countryDto.getPresidentName());
        }
        System.out.println("--------------------------------");

        Query q2 = entityManager.createNamedQuery("query2");
        List result1 = q2.getResultList();
        System.out.println(result1.size());

        System.out.println("------------------------");


        Query q3 = entityManager.createNamedQuery("query3");
        List<CountryDto> result2=q3.getResultList();
        for (CountryDto countryDto : result2) {
            System.out.println(countryDto.getCountryCode());
            System.out.println(countryDto.getCountryName());
            System.out.println(countryDto.getPopulation());
            System.out.println(countryDto.getPresidentName());
        }
        System.out.println(("============================="));

        Query q4 = entityManager.createNamedQuery("query4");
        List result3 = q4.getResultList();
        System.out.println(result3);

        System.out.println(("============================="));

        Query q5 = entityManager.createNamedQuery("query5");
        List result4 = q5.getResultList();
        System.out.println(result4);

        System.out.println(("============================="));

        Query q6 = entityManager.createNamedQuery("query6");
        List result5 = q6.getResultList();
        System.out.println(result5);

        System.out.println(("============================="));

        Query q7 = entityManager.createNamedQuery("query7");
        List result6 = q7.getResultList();
        System.out.println(result6);

        System.out.println(("============================="));

        Query q8 = entityManager.createNamedQuery("query8");
        List<CountryDto> result7 = q8.getResultList();
        for (CountryDto countryDto : result7) {
            System.out.println(countryDto.getCountryCode());
            System.out.println(countryDto.getCountryName());
            System.out.println(countryDto.getPopulation());
            System.out.println(countryDto.getPresidentName());
        }
         

        entityManager.close();

    }
}
