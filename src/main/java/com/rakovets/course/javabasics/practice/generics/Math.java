package com.rakovets.course.javabasics.practice.generics;

public class Math<T> {

    public static <T extends Comparable<T>> T getMax(T type1, T type2, T type3) {
        if (type1.compareTo(type2) > 0) {
            if (type1.compareTo(type3) > 0) {
                return type1;
            } else {
                return type3;
            }
        } else if (type1.compareTo(type2) <= 0) {
            if (type2.compareTo(type3) > 0) {
                return type2;
            } else if (type2.compareTo(type3) < 0) {
                return type3;
            } else {
                return null;
            }
        }
        return null;
    }
}
