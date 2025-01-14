package com.itshaala;

import com.itshaala.model.Address;
import com.itshaala.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class EmployeeSave {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        Address address = new Address();
        address.setStreet("Highstreet, Balewadi");
        address.setCity("Pune");
        address.setState("Maharashtra");
        address.setCountry("India");
        address.setPincode("411004");

        Employee emp = new Employee();
        emp.setName("Satish");
        emp.setSalary(300000);
        emp.setDesignation("Developer");
        emp.setAddress(address);
        session.save(emp);

        tx.commit();
        session.close();
        System.out.println("Employee type object saved");
    }
}
