package com.itshaala.service;

import com.itshaala.dao.ActorDao;
import com.itshaala.model.Actor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ActorService {
    ActorDao actorDao = new ActorDao();

    public void addActor(Actor actor) {
        actorDao.addActor(actor);
    }

    public void editActor(Actor actor) {
        actorDao.editActor(actor);
    }

    public void deleteActor(Actor actor) {
        actorDao.deleteActor(actor);
    }

    public Actor getActorById(int id) {
        return actorDao.getActorById(id);
    }
}
