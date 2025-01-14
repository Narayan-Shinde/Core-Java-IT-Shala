package com.itshaala;

import com.itshaala.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .name("Kundan")
                .salary(7500)
                .tasks(List.of("Pushpa 2","hibernate revision","chai at fc road"))
                .build();
        //display("abc", "abx", "yb");
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Employee object saved");


    }

    public static void display(String... str) {
        for (String s : str) {
            System.out.println(s);
        }
    }
}
