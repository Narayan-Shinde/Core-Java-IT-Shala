package com.itshaala.controlller;

import com.itshaala.model.Actor;
import com.itshaala.service.ActorService;

public class ActorController {
    ActorService actorService = new ActorService();
    public void addActor(Actor actor) {
        actorService.addActor(actor);
    }


    public void editActor(Actor actor) {
        actorService.editActor(actor);
    }

    public void deleteActor(Actor actor) {
        actorService.deleteActor(actor);
    }

    public Actor getActorById(int id) {
        return actorService.getActorById(id);
    }
}
