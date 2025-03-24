package com.xworks.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Create {
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

//           String sqlQuery1="insert into PassengerInfo values('PI06' , 'tom' , 'male' , 'xyz' , 'FI02')";
//         statement.execute(sqlQuery1);
//           System.out.println("excuting sql query");

//            String sqlQuery2="insert into PassengerInfo values('PI07' , 'ram' , 'male' , 'uk' , 'FI03')";
//            statement.execute(sqlQuery2);
//            System.out.println("excuting sql query");


//            String sqlQuery3="insert into PassengerInfo values('PI08' , 'ramesh' , 'male' , 'indian' , 'FI04')";
//            statement.execute(sqlQuery3);
//            System.out.println("excuting sql query");
//
//            String sqlQuery4="insert into PassengerInfo values('PI09' , 'hoop' , 'male' , 'canada' , 'FI05')";
//            statement.execute(sqlQuery4);
//            System.out.println("excuting sql query");
//
//            String sqlQuery5="insert into PassengerInfo values('PI10' , 'nancy' , 'female' , 'france' , 'FI06')";
//            statement.execute(sqlQuery5);
//            System.out.println("excuting sql query");
//
//            String sqlQuery6="insert into PassengerInfo values('PI11' , 'sachin' , 'male' , 'spain' , 'FI07')";
//            statement.execute(sqlQuery6);
//            System.out.println("excuting sql query");
//
//            String sqlQuery7="insert into PassengerInfo values('PI12' , 'rakesh' , 'male' , 'france' , 'FI08')";
//            statement.execute(sqlQuery7);
//            System.out.println("excuting sql query");
//
//            String sqlQuery8="insert into PassengerInfo values('PI13' , 'surya' , 'male' , 'germany' , 'FI09')";
//            statement.execute(sqlQuery8);
//            System.out.println("excuting sql query");
//
            String sqlQuery9="insert into PassengerInfo values('PI14' , 'sam' , 'female' , 'canada' , 'FI010')";
            statement.execute(sqlQuery9);
            System.out.println("excuting sql query");


            String sqlQuery10="insert into PassengerInfo values('PI15' , 'mike' , 'male' , 'japan' , 'FI11')";
            statement.execute(sqlQuery10);
            System.out.println("excuting sql query");

            String sqlQuery11="insert into PassengerInfo values('PI16' , 'eleven' , 'female' , 'syria' , 'FI12')";
            statement.execute(sqlQuery11);
            System.out.println("excuting sql query");

            String sqlQuery12="insert into PassengerInfo values('PI17' , 'will' , 'male' , 'traq' , 'FI13')";
            statement.execute(sqlQuery12);
            System.out.println("excuting sql query");

            String sqlQuery13="insert into PassengerInfo values('PI18' , 'lucas' , 'male' , 'china' , 'FI14')";
            statement.execute(sqlQuery13);
            System.out.println("excuting sql query");

            String sqlQuery14="insert into PassengerInfo values('PI19' , 'max' , 'female' , 'iran' , 'FI15')";
            statement.execute(sqlQuery14);
            System.out.println("excuting sql query");

            String sqlQuery15="insert into PassengerInfo values('PI20' , 'dustin' , 'male' , 'finland' , 'FI16')";
            statement.execute(sqlQuery15);
            System.out.println("excuting sql query");

            String sqlQuery16="insert into PassengerInfo values('PI21' , 'steve' , 'male' , 'us' , 'FI17')";
            statement.execute(sqlQuery16);
            System.out.println("excuting sql query");

            String sqlQuery17="insert into PassengerInfo values('PI22' , 'joyce' , 'female' , 'maxican' , 'FI18')";
            statement.execute(sqlQuery17);
            System.out.println("excuting sql query");

            String sqlQuery18="insert into PassengerInfo values('PI23' , 'jonathan' , 'male' , 'uk' , 'FI19')";
            statement.execute(sqlQuery18);
            System.out.println("excuting sql query");

            String sqlQuery19="insert into PassengerInfo values('PI24' , 'robin' , 'female' , 'amarican' , 'FI20')";
            statement.execute(sqlQuery19);
            System.out.println("excuting sql query");

            String sqlQuery20="insert into PassengerInfo values('PI25' , 'jim' , 'male' , 'indian' , 'FI21')";
            statement.execute(sqlQuery20);
            System.out.println("excuting sql query");




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


