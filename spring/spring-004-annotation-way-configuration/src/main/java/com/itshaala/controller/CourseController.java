package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Component
public class CourseController {
    private CourseService courseService;

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }
}
