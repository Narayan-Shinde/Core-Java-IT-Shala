package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1CreateTable {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/isj010";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String sql = "create table student(id int primary key auto_increment, name varchar(50), age int)";

        //true - object is ResultSet
        //false - number of records updated

        boolean isTableCreated = statement.execute(sql);// DDL query
        connection.close();
        System.out.println("Table created successfully");
    }
}
