package com.xworks.jpaOperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class JPQLQuery {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String query = "select c from CountryDto c";
        Query query1 = entityManager.createQuery(query);
        List<CountryDto> result = query1.getResultList();
        for (CountryDto countryDto : result) {
            System.out.println(countryDto.getCountryCode());
            System.out.println(countryDto.getCountryName());
            System.out.println(countryDto.getPopulation());
            System.out.println(countryDto.getPresidentName());
        }
        System.out.println("--------------------------------");
        String query2 ="select count(*) from CountryDto c";
                Query query3 = entityManager.createQuery(query2);
        Long result1 = (Long) query3.getSingleResult();
        System.out.println(result1);

        System.out.println("------------------------");

        String query4 = "select c from CountryDto c where country_name like 'a%'";
        Query query5 = entityManager.createQuery(query4);
        List<CountryDto> result2=query5.getResultList();
        for (CountryDto countryDto : result2) {
            System.out.println(countryDto.getCountryCode());
            System.out.println(countryDto.getCountryName());
            System.out.println(countryDto.getPopulation());
            System.out.println(countryDto.getPresidentName());
        }
        System.out.println(("============================="));
        String query6 = "select avg(population) from CountryDto";
        Query query7 = entityManager.createQuery(query6);
        List result3 = query7.getResultList();
        System.out.println(result3);

        System.out.println(("============================="));
        String query8 = "select min(population) from CountryDto";
        Query query9 = entityManager.createQuery(query8);
        List result4 = query9.getResultList();
        System.out.println(result4);

        System.out.println(("============================="));
        String max = "select max(population) from CountryDto";
        Query maxQuery = entityManager.createQuery(max);
        List result5 = maxQuery.getResultList();
        System.out.println(result5);

        System.out.println(("============================="));
        String sum = "select sum(population) from CountryDto";
        Query sumQuery = entityManager.createQuery(sum);
        List result6 = sumQuery.getResultList();
        System.out.println(result6);

        System.out.println(("============================="));
        String between = "select c from CountryDto c where population between 100 and 1000000";
        Query betweenQuery = entityManager.createQuery(between);
        List<CountryDto> result7 = betweenQuery.getResultList();
        for (CountryDto countryDto : result7) {
            System.out.println(countryDto.getCountryCode());
            System.out.println(countryDto.getCountryName());
            System.out.println(countryDto.getPopulation());
            System.out.println(countryDto.getPresidentName());
        }
        System.out.println(("============================="));
        String parameter ="select c from CountryDto c where country_name=:name";
        Query parameterQuery =entityManager.createQuery(parameter);
        parameterQuery.setParameter("name","Brazil");
        List<CountryDto> result8 = parameterQuery.getResultList();
        for (CountryDto countryDto : result8) {
            System.out.println(countryDto.getCountryCode());
            System.out.println(countryDto.getCountryName());
            System.out.println(countryDto.getPopulation());
            System.out.println(countryDto.getPresidentName());
        }

        entityManager.close();

    }


}

