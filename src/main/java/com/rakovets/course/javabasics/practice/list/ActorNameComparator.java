package com.rakovets.course.javabasics.practice.list;

import com.rakovets.course.javabasics.practice.list.Actor;

import java.util.Comparator;

public class ActorNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getLastname().compareTo(o2.getLastname());
    }
}
