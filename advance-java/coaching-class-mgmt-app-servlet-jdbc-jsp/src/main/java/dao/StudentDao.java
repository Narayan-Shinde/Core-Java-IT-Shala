package dao;

import lombok.SneakyThrows;
import model.Student;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    @SneakyThrows
    public void addStudent(Student student) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "insert into student(name, email, phone, address) values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getEmail());
        preparedStatement.setString(3, student.getPhone());
        preparedStatement.setString(4, student.getAddress());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        System.out.println("Student added successfully");
    }

    @SneakyThrows
    public void editStudent(Student student) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "update student set name = ?, email = ?, phone = ?, address = ? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getEmail());
        preparedStatement.setString(3, student.getPhone());
        preparedStatement.setString(4, student.getAddress());
        preparedStatement.setInt(5, student.getId());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        System.out.println("Student updated successfully");
    }

    @SneakyThrows
    public void deleteStudent(Student student) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "delete from student where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, student.getId());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        System.out.println("Student deleted successfully");
    }

    @SneakyThrows
    public List<Student> getAllStudents() {
        Connection connection = ConnectionUtil.getConnection();
        String query = "select * from student";
        List<Student> students = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setEmail(resultSet.getString("email"));
            student.setPhone(resultSet.getString("phone"));
            student.setAddress(resultSet.getString("address"));
            students.add(student);
        }
        statement.close();
        resultSet.close();
        connection.close();
        return students;
    }

    @SneakyThrows
    public Student getStudentById(int id) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "select * from student where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        Student student = new Student();
        while (resultSet.next()) {
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setEmail(resultSet.getString("email"));
            student.setPhone(resultSet.getString("phone"));
            student.setAddress(resultSet.getString("address"));
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();
        return student;
    }

    @SneakyThrows
    public List<Student> getStudentsByNameOrEmailOrPhoneOrAddress(String input) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "select * from student where name=? or email=? or phone=? or address=?";
        List<Student> students = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, input);
        preparedStatement.setString(2, input);
        preparedStatement.setString(3, input);
        preparedStatement.setString(4, input);
        ResultSet resultSet = preparedStatement.executeQuery(query);
        while (resultSet.next()) {
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setEmail(resultSet.getString("email"));
            student.setPhone(resultSet.getString("phone"));
            student.setAddress(resultSet.getString("address"));
            students.add(student);
        }
        preparedStatement.close();
        resultSet.close();
        connection.close();
        return students;
    }
}
