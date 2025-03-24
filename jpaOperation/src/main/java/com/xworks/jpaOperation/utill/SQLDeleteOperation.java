package com.xworks.jpaOperation.utill;

import javax.persistence.*;

public class SQLDeleteOperation {
    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        String sqlQuery="delete from country_info where country_name='Bhutan'";
        // Query query = entityManger.createNamedQuery("sqlQuery1");
        //Query query = entityManger.createQuery(sqlQuery);//not mapped exception for both create query and createNamedQuery
        Query query = entityManger.createNativeQuery(sqlQuery);
        query.executeUpdate();
        transaction.commit();
        entityMangerFactory.close();
    }
}
