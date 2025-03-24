package com.xworks.jpaOperation.utill;

import javax.persistence.*;

public class SQLInsertOperation {
    public static void main(String[] args) {
        EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("java");
        EntityManager entityManger = entityMangerFactory.createEntityManager();

        EntityTransaction transaction = entityManger.getTransaction();
        transaction.begin();
        String sqlQuery="insert into country_info values(31, 'XYZ', 7895465,'ABC'";
        //Query query = entityManger.createQuery(sqlQuery);//it is not possible
        //Query query = entityManger.createNamedQuery("sqlQuery2");//it is not possible
        Query query = entityManger.createNativeQuery(sqlQuery);
        query.executeUpdate();
        transaction.commit();
        entityMangerFactory.close();
    }
}
