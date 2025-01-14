package crud;

import java.sql.*;
import java.util.Scanner;

public class Demo9FetchRecordsPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/isj010";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id");
        int id = scanner.nextInt();

        String sql = "select * from student where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();// DQL query

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
