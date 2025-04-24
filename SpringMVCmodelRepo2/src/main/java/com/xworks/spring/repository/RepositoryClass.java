package com.xworks.spring.repository;

import com.xworks.spring.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class RepositoryClass implements RepositoryInterface{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public StudentEntity save(StudentEntity entity) {
        System.out.println("it is repository class implement");
        System.out.println("entity in repo==============="+entity);
   // EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("java");
   EntityManager entityManger = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManger.getTransaction();
            transaction.begin();
            entityManger.persist(entity);
            transaction.commit();
            return entity;
        } catch (Exception e) {
            System.out.println("exception occur");
            return null;
        }finally {
            entityManger.close();
        }

    }

}
