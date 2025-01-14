package com.itshaala;

import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseApp {
    public static void main(String[] args) {
        //CourseController courseController = new CourseController();

        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.cfg.xml");

        CourseController courseController = context.getBean("courseController", CourseController.class);

        courseController.addCourse(
                Course.builder().id(101).name("spring").build()
        );
    }
}
