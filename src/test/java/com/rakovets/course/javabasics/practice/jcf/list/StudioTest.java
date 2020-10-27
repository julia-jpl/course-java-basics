package com.rakovets.course.javabasics.practice.jcf.list;

import com.rakovets.course.javabasics.example.collections.Actor;
import com.rakovets.course.javabasics.example.collections.Studio;
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
    }
}
