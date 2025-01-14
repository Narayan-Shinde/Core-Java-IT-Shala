import java.sql.*;

public class EmployeeJdbcApp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step 1 : load and register the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step 2: get the connection
        String url = "jdbc:mysql://localhost:3306/hr";
        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);

        //step 3: Create the Statement type object in order to execute the query
        Statement statement = connection.createStatement();

        // step 4 : execute the query and get the result
        String sql = "select * from employees";
        ResultSet resultSet = statement.executeQuery(sql);

        //step 5 : use the result
        System.out.println("Id\t"+"First Name \t"+"Last Name\t"+"Salary");
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getInt(1) + "\t" +
                            resultSet.getString(2) + "\t" +
                            resultSet.getString("last_name") + "\t" +
                            resultSet.getInt("salary")

            );
        }

        //step 6 : close the connection
        connection.close();
    }
}
