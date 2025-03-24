package com.xworks.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUsingExeUpdate {
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
            System.out.println("establishing connection from database");

            Statement statement = connection.createStatement();
            System.out.println("creating statement");

            String Query="delete from PassengerInfo where passenger_name='max'";
            statement.executeUpdate(Query);
            System.out.println("deleting data using delete query");

            String Query1="delete from PassengerInfo where passenger_id='PI05'";
            statement.executeUpdate(Query1);
            System.out.println("deleting data using delete query");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

