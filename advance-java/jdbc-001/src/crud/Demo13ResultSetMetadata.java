package crud;

import java.sql.*;

import static crud.Constants.*;

public class Demo13ResultSetMetadata {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step1 : load and register the Driver with driverManager
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2 : get the connection from DriverManager
        Connection connection = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);

        //step 3 : Statement to execute the dynamic query
        Statement statement = connection.createStatement();
        String selectQuery = "select * from student";

        //step 4
        ResultSet resultSet = statement.executeQuery(selectQuery);
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        System.out.println("Total # columns "+resultSetMetaData.getColumnCount());
        System.out.println("First Column name "+resultSetMetaData.getColumnName(1));
        System.out.println("Second column table name :  "+resultSetMetaData.getTableName(2));

        //step 5: close the conneciton
        connection.close();

    }
}
