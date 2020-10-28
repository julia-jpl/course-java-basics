package com.rakovets.course.javabasics.example.collections;

import java.util.LinkedList;

public class SchoolClass {
    private LinkedList<Student> students;


    public String getBestStudent(LinkedList<Student> students) {
        students.sort(new StudentAverageAnnualMarkComparator());
        return students.getLast().toString();
}
}
