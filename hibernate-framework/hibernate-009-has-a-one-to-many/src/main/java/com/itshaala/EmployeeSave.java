package com.itshaala;

import com.itshaala.model.Department;
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
        Department department = session.get(Department.class, 1);
        Transaction tx = session.beginTransaction();
        Employee emp = new Employee();
        emp.setName("Sanika");
        emp.setSalary(4500);
        emp.setDesignation("Java Developer");
        emp.setDepartment(department);
        session.save(emp);
        tx.commit();
        session.close();
        System.out.println("Employee type object saved");
    }
}
