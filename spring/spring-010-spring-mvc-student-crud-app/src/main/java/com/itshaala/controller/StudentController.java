package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    @RequestMapping(method = RequestMethod.POST) //@PostMapping
    public ModelAndView addStudent(@ModelAttribute("student") Student student) {
        studentService.addStudent(student);
        ModelAndView modelAndView = new ModelAndView("student");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}") //@GetMapping
    public ModelAndView getStudentById(@PathVariable("id") int id) {
        Student student = studentService.getStudentById(id);
        List<Student> students = new ArrayList<>();
        students.add(student);
        ModelAndView modelAndView = new ModelAndView("student");
        modelAndView.addObject("student", students);
        return modelAndView;
    }

    @GetMapping("/id")
    public ModelAndView getStudentById2(@RequestParam("id") int id) {
        Student student = studentService.getStudentById(id);
        List<Student> students = new ArrayList<>();
        students.add(student);
        ModelAndView modelAndView = new ModelAndView("student");
        modelAndView.addObject("student", students);
        return modelAndView;
    }

    @GetMapping
    public ModelAndView getAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        ModelAndView modelAndView = new ModelAndView("student");
        modelAndView.addObject("student", allStudents);
        return modelAndView;
    }

}
