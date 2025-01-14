package storedProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static crud.Constants.*;

public class Demo1CreateStoredProcedure {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step1 : load and register the Driver with driverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2 : get the connection from DriverManager
        Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);

        //step 3: create CallableStatement object
        String query = "create procedure isj010.bulk_insert_students() " +
                " begin" +
                " insert into student(name, age) values('a',1); " +
                " insert into student(name, age) values('b',2); " +
                " insert into student(name, age) values('c',3); " +
                " insert into student(name, age) values('d',4); " +
                " insert into student(name, age) values('e',5); " +
                " " +
                "End";
        CallableStatement callableStatement = connection.prepareCall(query);
        callableStatement.execute();

        //step: 4 close the connection
        System.out.println("stored procedure created successfully");

    }
}
