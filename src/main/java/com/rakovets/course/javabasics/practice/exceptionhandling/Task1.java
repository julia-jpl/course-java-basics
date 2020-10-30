package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task1 {
    public static void main(String[] args) {
    String string = null;
    try {
        string.length();
    } catch (NullPointerException e) {
        System.out.println("Значение строки null");
    }
    }
}
