package com.rakovets.course.javabasics.practice.jcf.list;

import com.rakovets.course.javabasics.example.collections.SchoolClass;
import com.rakovets.course.javabasics.example.collections.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class SchoolClassTest {

    @Test
    void getBestStudentTest() {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("John", "Brown", 12, 9));
        students.add(new Student("Carl", "White", 11, 7));
        students.add(new Student("Mary", "White", 10, 8));
        students.add(new Student("Ann", "Snow", 12, 10));
        students.add(new Student("Mark", "Black", 13, 6));
        SchoolClass schoolClass = new SchoolClass(students);
        String bestStudent = schoolClass.getBestStudent(students);
        Assertions.assertEquals("Student Ann Snow, age 12, average mark = 10.", bestStudent);
    }

    @Test
    void getOldestStudentTest() {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("John", "Brown", 12, 9));
        students.add(new Student("Carl", "White", 11, 7));
        students.add(new Student("Mary", "White", 10, 8));
        students.add(new Student("Ann", "Snow", 12, 10));
        students.add(new Student("Mark", "Black", 13, 6));
        SchoolClass schoolClass = new SchoolClass(students);
        String oldestStudent = schoolClass.getOldestStudent(students);
        Assertions.assertEquals("Student Mark Black, age 13, average mark = 6.", oldestStudent);
    }
    @Test
    void getFirstOfStudentsSortedByNameAndSurnameComparator() {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Ann", "Brown", 12, 9));
        students.add(new Student("Carl", "White", 11, 7));
        students.add(new Student("Mary", "White", 10, 8));
        students.add(new Student("Ann", "Snow", 12, 10));
        students.add(new Student("Mark", "Black", 13, 6));
        SchoolClass schoolClass = new SchoolClass(students);
        String firstStudent = schoolClass.getFirstOfStudentsSortedByNameAndSurnameComparator(students);
        Assertions.assertEquals("Student Ann Brown, age 12, average mark = 9.", firstStudent);
    }
}
