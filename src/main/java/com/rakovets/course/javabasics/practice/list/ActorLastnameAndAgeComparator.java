package com.rakovets.course.javabasics.practice.list;

import com.rakovets.course.javabasics.practice.list.Actor;

import java.util.Comparator;

public class ActorLastnameAndAgeComparator implements Comparator<Actor> {
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
