package com.rakovets.course.javabasics.example.collections;

import java.util.Comparator;

public class ActorLastnameAndAgeCorparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int result = o1.getLastname().compareTo(o2.getLastname());
        if (result == 0) {
            return o1.getAge() - o2.getAge();
        } else {
            return result;
        }
    }
}
