package com.itshaala.service;

import com.itshaala.dao.CourseDao;
import com.itshaala.model.Course;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CourseService {
    //CourseService is dependent on courseDao(dependency)
    //CourseDao courseDao = new CourseDao();
    CourseDao courseDao;

    //use lombok
    /*public CourseService(CourseDao courseDao) {
        this.courseDao = courseDao;
    }*/

    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }
}
