package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo7InsertIntoTableFromUser {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/isj010";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

        //get the data from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name and age");
        String name = scanner.next();
        int age = scanner.nextInt();
        String sql = "insert into student(name, age) values('" + name + "'," + age + " )";
        statement.executeUpdate(sql);// DML query
        connection.close();
        System.out.println("Record inserted successfully");
    }
}
