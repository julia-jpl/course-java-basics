package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task2 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        try {
            numbers[6] = 56;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This element of array doesn't exist");
        }
    }
}
