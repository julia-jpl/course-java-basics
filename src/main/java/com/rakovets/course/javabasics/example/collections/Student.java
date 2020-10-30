package com.rakovets.course.javabasics.example.collections;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int averageAnnualMark;

    public Student (String name, String surname, int age, int averageAnnualMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageAnnualMark = averageAnnualMark;
    }

    @Override
    public String toString() {
        return "Student " + name + " " + surname + ", age " + age + ", average mark = " + averageAnnualMark +'.';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAverageAnnualMark() {
        return averageAnnualMark;
    }

    public void setAverageAnnualMark(int averageAnnualMark) {
        this.averageAnnualMark = averageAnnualMark;
    }
}
