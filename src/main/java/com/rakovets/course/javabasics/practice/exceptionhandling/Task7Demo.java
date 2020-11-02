package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task7Demo {
    public static void main(String[] args) {
        try {
            Task7.doDivisionByRandomDigital();
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is impossible");
        } finally {
            System.out.println("Try again.");
        }

    }
}
