package com.rakovets.course.javabasics.practice.exceptionhandling.task6;

public class Task6 {
    public static void getThreeExceptions() throws ArrayIndexOutOfBoundsException, ArithmeticException, StringIndexOutOfBoundsException{
        int a = (int) (Math.random() * 3);
        System.out.println(a);
        int[] numbers = new int[] {5 / a, 5};
        numbers[a] = 3;
        String word = "w";
        char first = word.charAt(a);
    }
}
