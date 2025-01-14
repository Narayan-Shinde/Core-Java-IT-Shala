package com.itshaala.dao;

import com.itshaala.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addStudent(Student student) {
        String sql = "insert into student(id,name,age,email) values(?,?,?,?)";
        PreparedStatementSetter preparedStatementSetter = pss -> {
            pss.setInt(1, student.getId());
            pss.setString(2, student.getName());
            pss.setInt(3, student.getAge());
            pss.setString(4, student.getEmail());
        };
        jdbcTemplate.update(sql, preparedStatementSetter);
    }
}
