package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaWayConfiguration {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //Student student = (Student) context.getBean("student");
        Student student = context.getBean( Student.class);
        System.out.println(student);
    }
}
