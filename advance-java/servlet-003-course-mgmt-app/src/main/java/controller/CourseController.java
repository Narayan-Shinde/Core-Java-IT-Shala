package controller;

import model.Course;
import service.CourseService;

import java.util.List;

public class CourseController {
    CourseService courseService = new CourseService();

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    public void deleteCourse(int id) {
        courseService.deleteCourse(id);
    }
}
