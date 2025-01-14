package service;

import dao.StudentDao;
import model.Student;

import java.util.List;

public class StudentService {
    StudentDao studentDao = new StudentDao();

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void editStudent(Student student) {
        studentDao.editStudent(student);
    }

    public void deleteStudent(Student student) {
        studentDao.deleteStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public List<Student> getStudentsByNameOrEmailOrPhoneOrAddress(String input) {
        return studentDao.getStudentsByNameOrEmailOrPhoneOrAddress(input);
    }
}
