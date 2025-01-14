package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static constants.Mysql.*;

public class ConnectionUtil {

    private static Connection connection;

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
            }
        }
        return connection;
    }
}
