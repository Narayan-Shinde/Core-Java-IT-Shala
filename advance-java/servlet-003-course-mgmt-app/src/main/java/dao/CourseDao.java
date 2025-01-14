package dao;

import model.Course;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    public void addCourse(Course course) {
        Connection connection = ConnectionUtil.getConnection();
        String sql = "insert into course(name, description,duration,fees) values(?,?,?,?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getDescription());
            preparedStatement.setString(3, course.getDuration());
            preparedStatement.setInt(4, course.getFees());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" exception in query");
        }
        System.out.println("Course added successfully");

    }

    public List<Course> getAllCourses() {
        Connection connection = ConnectionUtil.getConnection();
        String sql = "select * from course";
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        List<Course> courses = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Course course = new Course();
                course.setId(resultSet.getInt("id"));
                course.setName(resultSet.getString("name"));
                course.setDescription(resultSet.getString("description"));
                course.setDuration(resultSet.getString("duration"));
                course.setFees(resultSet.getInt("fees"));
                courses.add(course);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return courses;
    }

    public void deleteCourse(int id) {
        Connection connection = ConnectionUtil.getConnection();
        String sql = "delete from course where id = ?";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Couse deleted successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editCourse(Course course) {
        Connection connection = ConnectionUtil.getConnection();

    }
}