package com.itshaala.dao;

import com.itshaala.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
public class StudentDao {

    private JdbcTemplate jdbcTemplate;

    public void add(Student student) {
        String sql = "insert into student(id, name, email, age) values(?,?,?,?)";
        //jdbcTemplate.update(sql, student.getId(), student.getName(), student.getEmail(), student.getAddress());
        PreparedStatementSetter preparedStatementSetter = pss -> {
            pss.setLong(1, student.getId());
            pss.setString(2, student.getName());
            pss.setString(3, student.getEmail());
            pss.setInt(4, student.getAge());
        };

        jdbcTemplate.update(sql, preparedStatementSetter);

        System.out.println("student added to database");
    }

    public void update(Student student) {
        String sql = "update student set name = ?, email = ?, age = ? where id = ?";
        PreparedStatementSetter preparedStatementSetter = pss -> {
            pss.setString(1, student.getName());
            pss.setString(2, student.getEmail());
            pss.setInt(3, student.getAge());
            pss.setLong(4, student.getId());
        };

        jdbcTemplate.update(sql, preparedStatementSetter);
        System.out.println("student updated successfully");
    }

    public void delete(int id) {
        String sql = "delete from student where id = ?";
        jdbcTemplate.update(sql, id);
        System.out.println("student deleted successfully");
    }

    public Student getById(int id) {
        String sql = "select * from student where id = "+id;
        Student student = jdbcTemplate.queryForObject(sql, Student.class);
        return student;
    }

    public List<Student> getAll() {
        String sql = "select * from student";
        return null;
    }
}
