package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Data
@NoArgsConstructor
@Component
public class CourseController {

    @Autowired
    private CourseService courseService;

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }
}
