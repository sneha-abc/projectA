package com.xworks.jpaOperation;

import com.xworks.jpaOperation.utill.EntityManagerFactoryUtill;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CountryDaoImpli implements CountryDao{
    @Override
    public CountryDto saveCountry(CountryDto countryDto) {
        EntityManagerFactory entityManagerFactory=EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        try {
            EntityTransaction entityTransaction =entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.merge(countryDto);
            entityTransaction.commit();
             entityManager.close();

        }
        catch (Exception e){
            System.out.println("exception occured");
            return  null;
        }
        return countryDto;
    }

    @Override
    public int getCountryNameByCountryCode(int country_code) {
        EntityManagerFactory entityManagerFactory=EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CountryDto country = entityManager.find(CountryDto.class ,country_code);

        System.out.println(country.getCountryName());
        return country_code;
    }

    @Override
    public int getPresidentNameByCountryCode(int country_code) {
        EntityManagerFactory entityManagerFactory=EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManager=entityManagerFactory.createEntityManager();

        CountryDto country = entityManager.find(CountryDto.class ,country_code);
        System.out.println(country.getPresidentName());
        return country_code;
    }

    @Override
    public void updatePresidentName(CountryDto countryDto, int country_code) {
        EntityManagerFactory entityManagerFactory= EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        CountryDto country = entityManager.find(CountryDto.class , country_code);
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        country.setPresidentName("sujay");
        transaction.commit();
        entityManager.close();


    }

    @Override
    public void deleteCountry(int country_code) {
        EntityManagerFactory entityManagerFactory=EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        CountryDto country = entityManager.find(CountryDto.class ,country_code);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(country);
        transaction.commit();
        entityManager.close();


    }

    @Override
    public void getCountryNames() {
        EntityManagerFactory entityManagerFactory=EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
      String query = "select c.country_name from CountryDto c";
      Query query1=  entityManager.createQuery(query);
      List<String> result =query1.getResultList();
        for (String s : result) {
            System.out.println(s);
        }
    }

    @Override
    public List<Object> getAllCountryNameAndPresidentName() {
        EntityManagerFactory entityManagerFactory=EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        String query = "select c.country_name,c.president_name from CountryDto c";
        Query query1=  entityManager.createQuery(query);
        List<Object[]> result =query1.getResultList();
        for (Object[] s : result) {
            System.out.println(s[0]);
            System.out.println(s[1]);

        }
        return Collections.emptyList();
    }

    @Override
    public void getAllCountryNameAndPresidentNameByCountryCode(int country_code) {
        EntityManagerFactory entityManagerFactory=EntityManagerFactoryUtill.getEntityManagerFactory();
        EntityManager entityManager=entityManagerFactory.createEntityManager();

        CountryDto country = entityManager.find(CountryDto.class ,country_code);

        System.out.println(country.getCountryName());
        System.out.println(country.getPresidentName());
    }
}
