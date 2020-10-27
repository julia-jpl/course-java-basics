package com.rakovets.course.javabasics.example.collections;

import java.util.Comparator;

public class ActorFeeAndLastnameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int result = o1.getFee() - o2.getFee();
        if (result == 0) {
            return o1.getLastname().compareTo(o2.getLastname());
        } else {
            return result;
        }
    }
}
