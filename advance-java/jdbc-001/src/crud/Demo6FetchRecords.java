package crud;

import java.sql.*;

public class Demo6FetchRecords {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/isj010";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String sql = "select * from student";
        ResultSet resultSet = statement.executeQuery(sql);// DQL query
        while (resultSet.next()) {
           /* System.out.println(resultSet.getInt("id") + "\t" +
                    resultSet.getString("name") + "\t" +
                    resultSet.getInt("age")
            );*/

            System.out.println(resultSet.getInt(1) + "\t" +
                    resultSet.getString(2) + "\t" +
                    resultSet.getInt(3)
            );
        }
        connection.close();
    }
}
