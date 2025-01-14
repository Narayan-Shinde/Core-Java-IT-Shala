package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor
@Controller
public class StudentController {

    private StudentService studentService;

    public void add(Student student) {
        studentService.add(student);
    }

    public void update(Student student) {
        studentService.update(student);
    }

    public void delete(int id) {
        studentService.delete(id);
    }

    public Student getById(int id) {
        return studentService.getById(id);
    }

    public List<Student> getAll() {
        return studentService.getAll();
    }
}
