package com.itshaala;

import com.itshaala.config.SpringConfiguration;
import com.itshaala.controller.StudentController;
import com.itshaala.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        StudentController sc = context.getBean(StudentController.class); ;
      /*  sc.update(Student.builder()
                .id(120)
                .name("Ganesh More")
                .email("ganesh.more@gmail.com")
                .age(23)
                .build());*/
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id of the student");
        int id = scanner.nextInt();
       // sc.delete(id);*/

        Student student = sc.getById(120);
        System.out.println(student);
        List<Student> studentList = sc.getAll();

    }
}
