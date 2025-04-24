package com.xworks.spring.repository;

import com.xworks.spring.enitiy.StudentEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
@Repository
public class RepositoryClass implements RepositoryInterface{

    @Override
    public StudentEntity save(StudentEntity entity) {
        System.out.println("it is repository class implement");
        System.out.println("entity in repo==============="+entity);
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManger.getTransaction();
            transaction.begin();
            entityManger.merge(entity);
            transaction.commit();
            entityMangerFactory.close();
        } catch (Exception e) {

            System.out.println("exception occur");
            return null;

        }
        return null;
    }

}
