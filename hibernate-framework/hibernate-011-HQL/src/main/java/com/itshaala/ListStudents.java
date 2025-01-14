package com.itshaala;

import com.itshaala.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Hello world!
 */
public class ListStudents {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        int id = 52;//get this from user
        String hql = "from Student where id=:id";
        Query<Student> query = session.createQuery(hql);
        query.setParameter("id", id);
        List<Student> students = query.list();
        students.forEach(System.out::println);
        session.close();

    }
}
