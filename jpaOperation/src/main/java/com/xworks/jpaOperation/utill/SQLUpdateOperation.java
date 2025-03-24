package com.xworks.jpaOperation.utill;

import javax.persistence.*;

public class SQLUpdateOperation {
    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        String sqlQuery="update country_info set president_name='Tom' where country_name='Australia'";
        //Query query = entityManger.createQuery(sqlQuery);//it is not possible
        //Query query = entityManger.createNamedQuery("sqlQuery3");//it is not possible
        Query query = entityManger.createNativeQuery(sqlQuery);
        query.executeUpdate();
        transaction.commit();
        entityMangerFactory.close();
    }

}
