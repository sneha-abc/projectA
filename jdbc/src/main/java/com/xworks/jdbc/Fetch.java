package com.xworks.jdbc;

import java.sql.*;

public class Fetch {

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

                String sqlQuery1="select count(*) from PassengerInfo";
                boolean result = statement.execute(sqlQuery1);
                System.out.println(result);

                //int result1 = statement.executeUpdate(sqlQuery1);we will get exception
                //System.out.println(result1);

                ResultSet result2 = statement.executeQuery(sqlQuery1);
                System.out.println(result2);//it will give fully qualified path
                if(result2.next()) {
                 System.out.println(result2.getString("count(*)"));
                }

                String sqlQuery2="select * from PassengerInfo";
                ResultSet result3 = statement.executeQuery(sqlQuery2);
                System.out.println(result3);
                while(result3.next()) {
                    System.out.println(result3.getString("passenger_id"));
                    System.out.println(result3.getString("passenger_name"));
                    System.out.println(result3.getString("gender"));
                    System.out.println(result3.getString("nationality"));
                    System.out.println(result3.getString("flight_id"));
                }
                String sqlQuery3 = "select * from PassengerInfo where flight_id='FI05' or passenger_name='leela'";
                ResultSet result4 = statement.executeQuery(sqlQuery3);
                System.out.println(result4);
                while(result4.next()) {
                    System.out.println(result4.getString("passenger_id"));
                    System.out.println(result4.getString("passenger_name"));
                    System.out.println(result4.getString("gender"));
                    System.out.println(result4.getString("nationality"));
                    System.out.println(result4.getString("flight_id"));
                }

                String sqlQuery4 = "select * from PassengerInfo where nationality like '%i' or passenger_name like 's%'";
                ResultSet result5 = statement.executeQuery(sqlQuery4);
                System.out.println(result5);
                while(result5.next()) {
                    System.out.println(result5.getString("passenger_id"));
                    System.out.println(result5.getString("passenger_name"));
                    System.out.println(result5.getString("gender"));
                    System.out.println(result5.getString("nationality"));
                    System.out.println(result5.getString("flight_id"));
                }

                String sqlQuery5 = "select * from PassengerInfo where  flight_id='FI09' not between 'PI01' and 'PI05'";
                ResultSet result6 = statement.executeQuery(sqlQuery5);
                System.out.println(result6);
                while(result6.next()) {
                    System.out.println(result6.getString("passenger_id"));
                    System.out.println(result6.getString("passenger_name"));
                    System.out.println(result6.getString("gender"));
                    System.out.println(result6.getString("nationality"));
                    System.out.println(result6.getString("flight_id"));
                }

                String sqlQuery6 = "select * from PassengerInfo where nationality='indian' or passenger_id>'PI20' or  " +
                        "flight_id ='FI25'";
                ResultSet result7 = statement.executeQuery(sqlQuery6);
                System.out.println(result7);
                while(result7.next()) {
                    System.out.println(result7.getString("passenger_id"));
                    System.out.println(result7.getString("passenger_name"));
                    System.out.println(result7.getString("gender"));
                    System.out.println(result7.getString("nationality"));
                    System.out.println(result7.getString("flight_id"));
                }

                String sqlQuery7 = "select * from PassengerInfo where nationality like '%i' or passenger_name like 's%'";
                ResultSet result8 = statement.executeQuery(sqlQuery7);
                System.out.println(result8);
                while(result8.next()) {
                    System.out.println(result8.getString("passenger_id"));
                    System.out.println(result8.getString("passenger_name"));
                    System.out.println(result8.getString("gender"));
                    System.out.println(result8.getString("nationality"));
                    System.out.println(result8.getString("flight_id"));
                }

                String sqlQuery8 = "select * from PassengerInfo  where nationality='maxico'   and  passenger_name between 'sam' and 'will' " ;
                ResultSet result9 = statement.executeQuery(sqlQuery8);
                System.out.println(result9);
                while(result9.next()) {
                    System.out.println(result9.getString("passenger_id"));
                    System.out.println(result9.getString("passenger_name"));
                    System.out.println(result9.getString("gender"));
                    System.out.println(result9.getString("nationality"));
                    System.out.println(result9.getString("flight_id"));
                }

                String sqlQuery9 = "select * from PassengerInfo where nationality like 'a%n' and gender='female'";
                ResultSet result10 = statement.executeQuery(sqlQuery9);
                System.out.println(result10);
                while(result10.next()) {

                    System.out.println(result10.getString("passenger_name"));

                }

                String sqlQuery10 = "select * from PassengerInfo where  passenger_name between 'maxi' and 'ram' or flight_id='PI10' and nationality='uk'";
                ResultSet result11 = statement.executeQuery(sqlQuery10);
                System.out.println(result11);
                while(result11.next()) {

                    System.out.println(result11.getString("passenger_name"));

                }

                System.out.println("excuting sql query");

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

