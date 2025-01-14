package com.itshaala;

import com.itshaala.model.ContractEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class ContractSave {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        ContractEmployee emp = new ContractEmployee();
        emp.setName("Pranay");
        emp.setAddress("Washim");
        emp.setDesignation("Finance Associate");
        emp.setInvoiceAmount(6000);

        session.save(emp);

        tx.commit();
        session.close();
        System.out.println("Employee type object saved");
    }
}
