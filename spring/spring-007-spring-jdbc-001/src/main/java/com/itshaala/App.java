package com.itshaala;

import com.itshaala.configuration.SpringCfg;
import com.itshaala.controller.StudentController;
import com.itshaala.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Student student = Student.builder()
                .id(1001)
                .name("Dhanshri")
                .age(22)
                .email("abc@gmail.com")
                .build();
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringCfg.class);
        StudentController studentController = context.getBean(StudentController.class);
        studentController.addStudent(student);

    }
}
