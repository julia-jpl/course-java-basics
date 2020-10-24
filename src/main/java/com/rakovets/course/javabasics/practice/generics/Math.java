package com.rakovets.course.javabasics.practice.generics;

public class Math<T> {

    public static <T extends Comparable<T>> T getMax(T type1, T type2, T type3) {
        T maxType = type1;
        if (type1.compareTo(type2) > 0) {
            if (type1.compareTo(type3) > 0) {
                maxType = type1;
            } else {
                maxType = type3;
            }
        } else if (type1.compareTo(type2) < 0) {
            if (type2.compareTo(type3) > 0) {
                maxType = type2;
            } else {
                maxType = type3;
            }
        } else if (type1.compareTo(type2) == 0) {
            if (type2.compareTo(type3) > 0) {
                maxType = type2;
            } else if (type2.compareTo(type3) < 0) {
                maxType = type3;
            } else {
                maxType = null;
            }
        } return maxType;
    }

    public static <T extends Comparable<T>> T getMin(T type1, T type2, T type3, T type4, T type5) {
        T minType = type1;
        if (type1.compareTo(type2) < 0) {
            if (type1.compareTo(type3) < 0) {
                if (type1.compareTo(type4) < 0) {
                    if (type1.compareTo(type5) < 0) {
                        minType = type1;
                    } else {
                        minType = type5;
                    }
                } else if (type4.compareTo(type5) < 0) {
                    minType = type4;
                } else {
                    minType = type5;
                }
            } else if (type3.compareTo(type4) < 0) {
                if (type3.compareTo(type5) < 0) {
                    minType = type3;
                } else {
                    minType = type5;
                }
            } else if (type4.compareTo(type5) < 0) {
                minType = type4;
            } else {
                minType = type5;
            }
        } else if (type2.compareTo(type3) < 0) {
            if (type2.compareTo(type4) < 0) {
                if (type2.compareTo(type5) < 0) {
                    minType = type2;
                } else {
                    minType = type5;
                }
            } else if (type4.compareTo(type5) < 0) {
                minType = type4;
            } else {
                minType = type5;
            }
        } else if (type3.compareTo(type4) < 0) {
            if (type4.compareTo(type5) < 0) {
                minType = type4;
            } else {
                minType = type5;
            }
        } else if (type4.compareTo(type5) < 0) {
            minType = type4;
        } else {
            minType = type5;
        }
        if ((type1.compareTo(type2) == 0) &&
                (type2.compareTo(type3) == 0) &&
                (type3.compareTo(type4) == 0) &&
                (type4.compareTo(type5) == 0) &&
                (type1.compareTo(type5) == 0)) {
            minType = null;
        } return minType;
    }
}


