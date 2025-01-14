package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {

    private StudentDao studentDao;

    public void add(Student student) {
        studentDao.add(student);
    }

    public void update(Student student) {
        studentDao.update(student);
    }

    public void delete(int id) {
        studentDao.delete(id);
    }

    public Student getById(int id) {
        return studentDao.getById(id);
    }

    public List<Student> getAll() {
        return studentDao.getAll();
    }
}
