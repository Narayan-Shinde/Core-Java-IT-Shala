package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static crud.Constants.*;

public class Demo10UpdateRecordPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step1 : load and register the Driver with driverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2 : get the connection from DriverManager
        Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);

        //accepting the user input
        System.out.println("Enter id, name, age");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();
        int age = scanner.nextInt();

        //step 3 : PreparedStatement to execute the dynamic query
        String query = "update student set name=?, age=? where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.setInt(3, id);

        //step 4: execute teh query
        int recordesUpdated = preparedStatement.executeUpdate();
        System.out.println("records updated "+recordesUpdated);

        //step 5: close the connection
        connection.close();
        System.out.println("student record updated..");

    }
}
