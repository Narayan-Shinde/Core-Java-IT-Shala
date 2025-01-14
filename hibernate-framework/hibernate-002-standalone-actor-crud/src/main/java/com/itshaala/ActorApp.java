package com.itshaala;

import com.itshaala.controlller.ActorController;
import com.itshaala.model.Actor;

/**
 * Hello world!
 */
public class ActorApp {
    public static void main(String[] args) {
        ActorController actorController = new ActorController();
        Actor actor = Actor.builder()
                .id(2)
                .name("Shahrukh Khan")
                .age(60)
                .gender("Male")
                .description("mhyyyyyyyyyyyyyyya")
                .build();
        //1. create
        //actorController.addActor(actor);
        //2. Edit
        //actorController.editActor(actor);

        //3. get
        //System.out.println(actorController.getActorById(2));

        //4/ delete
        actorController.deleteActor(actor);
    }
}
