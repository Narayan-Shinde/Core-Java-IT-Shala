package controller;

import model.Student;
import service.StudentService;

import java.util.List;


public class StudentController {
    StudentService studentService = new StudentService();

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    public void editStudent(Student student) {
        studentService.editStudent(student);
    }

    public void deleteStudent(Student student) {
        studentService.deleteStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentService.getStudentById(id);
    }

    public List<Student> getStudentsByNameOrEmailOrPhoneOrAddress(String input) {
        return studentService.getStudentsByNameOrEmailOrPhoneOrAddress(input);
    }
}
