package com.itshaala.service;

import com.itshaala.dao.CourseDao;
import com.itshaala.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Component
public class CourseService {
    private CourseDao courseDao;

    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }
}
