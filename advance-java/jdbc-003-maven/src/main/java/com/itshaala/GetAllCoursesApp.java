package com.itshaala;

import java.sql.*;

public class GetAllCoursesApp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/isj010";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from course");
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getInt("id") + "\t" +
                            resultSet.getString("name") + "\t" +
                            resultSet.getString("description") + "\t" +
                            resultSet.getString("duration") + "\t" +
                            resultSet.getInt("fees")
            );
        }
        connection.close();


    }
}
