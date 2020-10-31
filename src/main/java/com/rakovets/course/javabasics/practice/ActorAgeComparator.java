package com.rakovets.course.javabasics.practice;

import java.util.Comparator;

public class ActorAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getAge() - o2.getAge();
    }
}
