package com.itshaala;

import com.itshaala.model.A;
import com.itshaala.model.B;
import com.itshaala.model.C;
import com.itshaala.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 */
public class InheritanceApp {
    public static void main(String[] args) {

      /*  C c = new C();
        c.setX(1);
        c.setY(2);
        c.setZ(3);

        c.setP(10);
        c.setQ(20);
        c.setR(30);

        c.setM(100);
        c.setN(200);
        c.setO(300);*/

     /*   B b = new B();
        b.setX(1);
        b.setY(2);
        b.setZ(3);

        b.setP(10);
        b.setQ(20);
        b.setR(30);*/

        A a = new A();
        a.setX(1);
        a.setY(2);
        a.setZ(3);




        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(a);
        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("C object saved");
    }


}
