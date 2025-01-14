package com.itshaala.dao;

import com.itshaala.model.Actor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ActorDao {
    public void addActor(Actor actor) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(actor);
        transaction.commit();
        session.close();
        System.out.println("Actor added successfully");
    }

    public void editActor(Actor actor) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(actor);
        transaction.commit();
        session.close();
        System.out.println("Actor edited successfully");
    }

    public void deleteActor(Actor actor) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(actor);
        transaction.commit();
        session.close();
        System.out.println("Actor deleted successfully");
    }

    public Actor getActorById(int id) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Actor actor = session.get(Actor.class, id);
        session.close();
        System.out.println(actor);
        return actor;
    }
}
