package com.xworks.project.repository;

import com.xworks.project.entity.LogInEntity;
import com.xworks.project.entity.RegistrationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@Repository
public class RegistrationRepoImpli implements RegistrationRepoInterface{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean saveRegistrationData(RegistrationEntity registrationEntity) {
        System.out.println(registrationEntity);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(registrationEntity);
            System.out.println(registrationEntity);//we use persist we save new data  ,we use merge to existed data  to update
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("exception occurs 1111111");
        }finally {
            entityManager.close();
        }
        return false;
    }

    @Override
    public RegistrationEntity findByEmailId(String emailId) {
        System.out.println("finding by email");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            System.out.println(emailId);
            Query query = entityManager.createNamedQuery("findByEmail");
            query.setParameter("emailId",emailId);
            RegistrationEntity result = (RegistrationEntity) query.getSingleResult();
            transaction.commit();
            return result;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("ecxeption occurs 222222");
            return null;
        } finally {
            entityManager.close();
        }

    }

    @Override
    public RegistrationEntity findByMobileNo(long contactNumber) {
        System.out.println("finding by contact number");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("findByPhoneNo");
            query.setParameter("phoneNo",contactNumber);
            RegistrationEntity result = (RegistrationEntity) query.getSingleResult();
            transaction.commit();
            return result;

        } catch (Exception e) {
            System.out.println((e.getMessage()));
            System.out.println("ecxeption occurs 333");
            return null;
        } finally {
            entityManager.close();
        }

    }

    @Override
    public void login(LogInEntity logInEntity) {
        System.out.println(logInEntity);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(logInEntity);
            System.out.println(logInEntity);//we use persist we save new data  ,we use merge to existed data  to update
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("exception 44444");
        }finally {
            entityManager.close();
        }
    }

    @Override
    public void loginUpdate(RegistrationEntity registrationEntity) {
        System.out.println(registrationEntity);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(registrationEntity);
            System.out.println(registrationEntity);//we use persist we save new data  ,we use merge to existed data  to update
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("exception occurs 555");
        }finally {
            entityManager.close();
        }

    }

    @Override
    public void saveOtp(RegistrationEntity registrationEntity) {
        System.out.println(registrationEntity);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(registrationEntity);
            System.out.println(registrationEntity);//we use persist we save new data  ,we use merge to existed data  to update
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("exception occurs 555");
        }finally {
            entityManager.close();
        }
    }

    @Override
    public void resetPassword(RegistrationEntity registrationEntity) {
        System.out.println(registrationEntity);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(registrationEntity);
            System.out.println(registrationEntity);//we use persist we save new data  ,we use merge to existed data  to update
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("exception occurs 555");
        }finally {
            entityManager.close();
        }
    }

    @Override
    public LogInEntity findLoginDetails(String emailId) {
        System.out.println("finding by email");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            System.out.println(emailId);
            Query query = entityManager.createNamedQuery("findLoginDetails");
            query.setParameter("emailId",emailId);
            LogInEntity result = (LogInEntity) query.getSingleResult();
            transaction.commit();
            return result;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("ecxeption occurs 222222");
            return null;
        } finally {
            entityManager.close();
        }

    }

    @Override
    public void logout(LogInEntity logInEntity) {
        System.out.println(logInEntity);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(logInEntity);
            System.out.println(logInEntity);//we use persist we save new data  ,we use merge to existed data  to update
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("exception 44444");
        }finally {
            entityManager.close();
        }

    }

    @Override
    public void updateData(RegistrationEntity registrationEntity) {
        System.out.println(registrationEntity);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(registrationEntity);
            System.out.println(registrationEntity);//we use persist we save new data  ,we use merge to existed data  to update
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("exception occurs 1111111");
        }finally {
            entityManager.close();
        }

    }
}
