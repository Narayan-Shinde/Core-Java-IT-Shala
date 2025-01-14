package com.itshaala;

import com.itshaala.config.SpringConfiguration;
import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);

        CourseController courseController = context.getBean(CourseController.class);

        courseController.addCourse(
                Course.builder().id(101).name("spring").build()
        );
    }
}
