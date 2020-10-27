package com.rakovets.course.javabasics.example.collections;

import java.util.Comparator;

public class ActorNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getLastname().compareTo(o2.getLastname());
    }
}
