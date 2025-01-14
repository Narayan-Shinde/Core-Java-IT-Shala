package crud;

import java.sql.*;
import java.util.Scanner;

public class Demo8InsertIntoTableFromUserPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/isj010";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        //get the data from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name and age");
        String name = scanner.next();
        int age = scanner.nextInt();

        String sql = "insert into student(name, age) values(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.executeUpdate();

        connection.close();
        System.out.println("Record inserted successfully");
    }
}
