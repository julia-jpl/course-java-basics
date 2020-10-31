package com.rakovets.course.javabasics.practice;


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

        public LinkedList<Actor> getActorsSortedByFeeAndLastNameComparator(LinkedList<Actor> actors) {
                actors.sort(new ActorFeeAndLastnameComparator());
                return actors;
        }

        public LinkedList<Actor> getActorsSortedByLastNameAndAgeComparator(LinkedList<Actor> actors) {
                actors.sort(new ActorLastnameAndAgeComparator());
                return actors;
        }

        public LinkedList<Actor> getActorsSortedByNameComparator(LinkedList<Actor> actors) {
                actors.sort(new ActorNameComparator());
                return actors;
        }


}
