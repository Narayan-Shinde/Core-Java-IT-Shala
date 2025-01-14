package com.itshaala;

import com.itshaala.model.Course;
import com.itshaala.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class StudentSave {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Student student = new Student();
        student.setName("Ashish");
        student.setAge(21);
        session.save(student);

        Course course = new Course();
        course.setName("Java");

        session.save(course);
        session.save(student);

        tx.commit();
        session.close();
        System.out.println("Student and course type object saved");
    }
}
