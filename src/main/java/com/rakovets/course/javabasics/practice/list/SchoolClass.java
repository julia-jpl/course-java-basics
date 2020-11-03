package com.rakovets.course.javabasics.practice.list;

import java.util.LinkedList;

public class SchoolClass {
    private LinkedList<Student> students;

    public SchoolClass (LinkedList<Student> students) {
        this.students = students;
    }

    public String getBestStudent(LinkedList<Student> students) {
        students.sort(new StudentAverageAnnualMarkComparator());
        return students.getLast().toString();
    }

    public String getOldestStudent(LinkedList<Student> students) {
        students.sort(new StudentAgeComparator());
        return students.getLast().toString();
    }

    public String getFirstOfStudentsSortedByNameAndSurnameComparator(LinkedList<Student> students) {
        students.sort(new StudentNameAndSurnameComparator());
        return students.getFirst().toString();
    }
}
