package com.itshaala.dao;

import com.itshaala.model.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Data
@NoArgsConstructor
@Component
public class CourseDao {
    public void addCourse(Course course) {
        System.out.println("Course added successfully");
    }
}
