package com.rakovets.course.javabasics.practice.jcf.list;

import com.rakovets.course.javabasics.practice.Actor;
import com.rakovets.course.javabasics.practice.Studio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class StudioTest {

    @Test
    void fireTest() {
        LinkedList<Actor> actors = new LinkedList<>();
        actors.add(new Actor("Tom", "Brown", 1000, 35));
        actors.add(new Actor("Anna", "White", 2500, 28));
        actors.add(new Actor("Jane", "Black", 3500, 33));
        actors.add(new Actor("Julia", "Roberts", 5000, 45));
        actors.add(new Actor("John", "Snow", 2000, 25));
        Studio studio = new Studio(actors);
        LinkedList<Actor> changedStudio = studio.fire(actors);
        Actor actor1 = changedStudio.getLast();
        Assertions.assertEquals("Actor Jane Black, fee=3500, age 33.", actor1.toString());
        Actor actor2 = changedStudio.getFirst();
        Assertions.assertEquals("Actor Tom Brown, fee=1000, age 35.", actor2.toString());
    }

    @Test
    void getActorsSortedByFeeAndLastNameComparatorTest() {
        LinkedList<Actor> actors = new LinkedList<>();
        actors.add(new Actor("Tom", "Brown", 1000, 35));
        actors.add(new Actor("Anna", "White", 500, 28));
        actors.add(new Actor("Jane", "Black", 500, 33));
        actors.add(new Actor("Julia", "Roberts", 5000, 45));
        actors.add(new Actor("John", "Snow", 2000, 25));
        Studio studio = new Studio(actors);
        LinkedList<Actor> changedStudio = studio.getActorsSortedByFeeAndLastNameComparator(actors);
        Actor firstOfChangedStudio = changedStudio.getFirst();
        Assertions.assertEquals("Actor Jane Black, fee=500, age 33.", firstOfChangedStudio.toString());
    }

    @Test
    void getActorsSortedByLastNameAndAgeComparatorTest() {
        LinkedList<Actor> actors = new LinkedList<>();
        actors.add(new Actor("Tom", "Black", 1000, 35));
        actors.add(new Actor("Anna", "White", 500, 28));
        actors.add(new Actor("Jane", "Black", 500, 33));
        actors.add(new Actor("Julia", "Roberts", 5000, 45));
        actors.add(new Actor("John", "Snow", 2000, 25));
        Studio studio = new Studio(actors);
        LinkedList<Actor> changedStudio = studio.getActorsSortedByLastNameAndAgeComparator(actors);
        Actor firstOfChangedStudio = changedStudio.getFirst();
        Assertions.assertEquals("Actor Jane Black, fee=500, age 33.", firstOfChangedStudio.toString());
    }

    @Test
    void getActorsSortedByNameComparatorTest() {
        LinkedList<Actor> actors = new LinkedList<>();
        actors.add(new Actor("Tom", "Black", 1000, 35));
        actors.add(new Actor("Anna", "White", 500, 28));
        actors.add(new Actor("Jane", "Brown", 500, 33));
        actors.add(new Actor("Julia", "Roberts", 5000, 45));
        actors.add(new Actor("John", "Snow", 2000, 25));
        Studio studio = new Studio(actors);
        LinkedList<Actor> changedStudio = studio.getActorsSortedByNameComparator(actors);
        Actor firstOfChangedStudio = changedStudio.getFirst();
        Assertions.assertEquals("Actor Tom Black, fee=1000, age 35.", firstOfChangedStudio.toString());
    }
}
