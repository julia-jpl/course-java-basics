package com.rakovets.course.javabasics.example.collections;

import java.util.Comparator;

public class ActorFeeComparator implements Comparator<Actor> {
    public int compare(Actor a, Actor b) {
        int result = 0;
        if (a.getFee() > b.getFee()) {
            result = 1;
        } else if (a.getFee() < b.getFee()) {
            result = -1;
        }
        return result;
    }
}
