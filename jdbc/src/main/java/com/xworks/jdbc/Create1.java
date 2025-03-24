package com.xworks.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create1 {
    public static void main(String[] args) {
        System.out.println("hello world");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("registering driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/flight";
        String userName = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("estalishing connnection from database");

            Statement statement = connection.createStatement();
            System.out.println("creating statement");

           String Query="insert into PassengerInfo values('PI27' , 'pradeep' , 'male' , 'abc' , 'FI27')";
         statement.executeUpdate(Query);
           System.out.println("excuting sql query");

            String Query1="insert into PassengerInfo values('PI28' , 'leela' , 'female' , 'def' , 'FI28')";
            statement.executeUpdate(Query1);
            System.out.println("excuting sql query");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
