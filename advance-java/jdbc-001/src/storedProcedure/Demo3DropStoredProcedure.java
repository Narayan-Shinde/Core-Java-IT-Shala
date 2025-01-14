package storedProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static crud.Constants.*;

public class Demo3DropStoredProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step1 : load and register the Driver with driverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2 : get the connection from DriverManager
        Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);

        //step 3: create CallableStatement object
        String query = "drop procedure  isj010.bulk_insert_students";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();

        //step: 4 close the connection
        System.out.println("stored procedure dropped successfully");

    }
}
