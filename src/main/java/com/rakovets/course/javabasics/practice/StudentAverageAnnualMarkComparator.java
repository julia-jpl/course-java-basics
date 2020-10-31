package com.rakovets.course.javabasics.practice;

import java.util.Comparator;

public class StudentAverageAnnualMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAverageAnnualMark() - o2.getAverageAnnualMark();
    }
}

