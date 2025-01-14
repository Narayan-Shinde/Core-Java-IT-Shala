package crud;

import java.sql.*;
import java.util.Scanner;

import static crud.Constants.*;

public class Demo11BulkInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step1 : load and register the Driver with driverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2 : get the connection from DriverManager
        Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);

        //step 3 : Statement to execute the dynamic query
        String query1 = "insert into student(name, age) values('Arti',22)";
        String query2 = "insert into student(name, age) values('Yash',24)";
        String query3 = "insert into student(name, age) values('Ajay',20)";
        String query4 = "insert into student(name, age) values('Kundan',19)";
        String query5 = "insert into student(name, age) values('Vishwadeep',27)";

        Statement statement = connection.createStatement();

        statement.addBatch(query1);
        statement.addBatch(query2);
        statement.addBatch(query3);
        statement.addBatch(query4);
        statement.addBatch(query5);


        //step 4: execute teh query
        int[] recordsUpdated = statement.executeBatch();

        for (int temp : recordsUpdated) {
            System.out.print(temp + "\t");
        }

        //step 5: close the connection
        connection.close();
        System.out.println("bulk record updated..");

    }
}
