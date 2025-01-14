package com.itshaala;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;



@Component
@PropertySource("classpath:application.properties")
public class StudentController {

   @Autowired
    Environment environment;

    public void readStudentDetails(){
        System.out.println("id "+"\t"+environment.getProperty("student.id"));
        System.out.println("Name "+"\t"+environment.getProperty("student.name"));
        System.out.println("Age "+"\t"+environment.getProperty("student.age"));
        System.out.println("Address "+"\t"+environment.getProperty("student.address"));

    }
}
