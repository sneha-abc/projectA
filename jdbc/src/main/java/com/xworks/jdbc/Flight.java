package com.xworks.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class Flight {
    public static void main(String[] args) {

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
            System.out.println("establishing connection from database");

            String query = "insert into PassengerInfo (passenger_id,passenger_name,gender,nationality,flight_id) values (?,?,?,?,?)";
            prepareStatement = connection.prepareStatement(query);
            System.out.println("creating statement");

            Collection<FlightDto> passengerDtos = FlightRunner.getPassenger();
            for (FlightDto passengerDto : passengerDtos) {

                prepareStatement.setString(1,passengerDto.getPassengerId());
                prepareStatement.setString(2,passengerDto.getPassengerName());
                prepareStatement.setString(3,passengerDto.getGender());
                prepareStatement.setString(4,passengerDto.getNationality());
                prepareStatement.setString(5,passengerDto.getFlightId());

                prepareStatement.execute();


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
