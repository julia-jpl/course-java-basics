package com.rakovets.course.javabasics.practice.exceptionhandling.task6;

public class Task6Demo {
    public static void main(String[] args) {
        try {
            Task6.getThreeExceptions();
        } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
            String message = e.toString();
            System.out.println(message);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible");
        }
    }
}
