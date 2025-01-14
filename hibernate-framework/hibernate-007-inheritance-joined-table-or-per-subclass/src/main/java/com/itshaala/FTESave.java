package com.itshaala;

import com.itshaala.model.ContractEmployee;
import com.itshaala.model.FullTimeEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class FTESave {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        FullTimeEmployee emp = new FullTimeEmployee();
        emp.setName("Satish");
        emp.setAddress("Thane");
        emp.setDesignation("Developer");
        emp.setSalary(6000);

        session.save(emp);

        tx.commit();
        session.close();
        System.out.println("Employee type object saved");
    }
}
