package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;
    public void addStudent(Student student) {
        studentService.addStudent(student);
    }
}
