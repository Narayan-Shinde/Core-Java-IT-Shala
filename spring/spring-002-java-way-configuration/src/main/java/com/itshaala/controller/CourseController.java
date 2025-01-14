package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import lombok.AllArgsConstructor;


public class CourseController {
    //CourseController is dependent on courseService(dependency)
    //CourseService courseService = new CourseService();
    CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }
}
