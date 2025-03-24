package com.xworks.jdbc;

import java.sql.*;
import java.util.Collection;

 public class CountryPrepareStatment {
    public static void main(String[] args) {
        System.out.println("hello world");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("registering driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/countries";
        String userName = "root";
        String password = "root";
        Connection connection=null;
        PreparedStatement prepareStatement = null;

        try {
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("estalishing connnection from database");

            connection.setAutoCommit(false);

            String query = "insert into country_info (country_code,country_name,population,president_name) values (?,?,?,?)";
            prepareStatement = connection.prepareStatement(query);
            System.out.println("creating statement");

            Collection<CountryDto> countryDtos = CountryRunner.getCountry1();
            for (CountryDto countryDto : countryDtos) {

                prepareStatement.setInt(1,countryDto.getCountryCode());
                prepareStatement.setString(2,countryDto.getCountryName());
                prepareStatement.setLong(3,countryDto.getPopulation());
                prepareStatement.setString(4,countryDto.getPresidentName());
                prepareStatement.execute();

                connection.commit();

            }
            prepareStatement.execute();
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