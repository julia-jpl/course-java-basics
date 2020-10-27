package com.rakovets.course.javabasics.example.collections;


import java.util.LinkedList;

public class Studio {

        private LinkedList<Actor> actors;

        public Studio (LinkedList<Actor> actors) {
        this.actors = actors;
        }

        public LinkedList<Actor> fire(LinkedList<Actor> actors) {
                actors.sort(new ActorFeeComparator());
                actors.removeLast();
                return actors;
        }


}
