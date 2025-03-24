package com.xworks.jdbc;

import java.sql.*;

public class FetchByPrepareStatment {
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
        Connection connection=null;
        PreparedStatement prepareStatement = null;

        try {
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("estalishing connnection from database");

            String query = "select * from PassengerInfo where passenger_name=? ";
            prepareStatement = connection.prepareStatement(query);
            System.out.println("creating statement");

            prepareStatement.setString(1,"sneha");

            ResultSet result = prepareStatement.executeQuery();
            System.out.println(result);

            while(result.next())
            {
                System.out.println(result.getString(1));
                System.out.println(result.getString(2));
                System.out.println(result.getString(3));
                System.out.println(result.getString(4));
                System.out.println(result.getString(5));
            }
            System.out.println("executing query");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("closing costly resources");
            if(connection!=null)
            {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(prepareStatement!=null)
            {
                try {
                    prepareStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
