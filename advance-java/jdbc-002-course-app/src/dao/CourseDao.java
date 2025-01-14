package dao;

import model.Course;
import util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {

    public void addCourse(Course course) {
        String query = "insert into course(name, description, duration, fees) values(?,?,?,?)";
        Connection connection = ConnectionUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getDescription());
            preparedStatement.setString(3, course.getDuration());
            preparedStatement.setInt(4, course.getFees());
            preparedStatement.executeUpdate();
            System.out.println("Course created successfully");

        } catch (SQLException e) {
            System.out.println();
        }

    }

    public void editCourse(Course course) {
        String query = "update course set name=?, description=?, duration=?, fees=? where id=?";
        Connection connection = ConnectionUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getDescription());
            preparedStatement.setString(3, course.getDuration());
            preparedStatement.setInt(4, course.getFees());
            preparedStatement.setInt(5, course.getId());
            preparedStatement.executeUpdate();
            System.out.println("Course updated successfully");

        } catch (SQLException e) {
            System.out.println();
        }

    }

    public void deleteCourse(int courseId) {
        String query = "delete from course where id=?";
        Connection connection = ConnectionUtil.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, courseId);
            preparedStatement.executeUpdate();
            System.out.println("Course deleted successfully");

        } catch (SQLException e) {
            System.out.println();
        }
    }

    public Course getCourseById(int courseId) {
        String query = "select * from course where id=?";
        Connection connection = ConnectionUtil.getConnection();
        Course course = new Course();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, courseId);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                course.setId(resultSet.getInt(1));
                course.setName(resultSet.getString(2));
                course.setDescription(resultSet.getString(3));
                course.setFees(resultSet.getInt(4));
            }
        } catch (SQLException e) {
            System.out.println();
        }
        return course;
    }

    public List<Course> getAllCourses() {
        String query = "select * from course";
        Connection connection = ConnectionUtil.getConnection();
        List<Course> courseList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Course course = new Course();
                course.setId(resultSet.getInt(1));
                course.setName(resultSet.getString(2));
                course.setDescription(resultSet.getString(3));
                course.setDuration(resultSet.getString(4));
                course.setFees(resultSet.getInt(5));
                courseList.add(course);
            }
        } catch (SQLException e) {
            System.out.println();
        }
        return courseList;
    }
}
