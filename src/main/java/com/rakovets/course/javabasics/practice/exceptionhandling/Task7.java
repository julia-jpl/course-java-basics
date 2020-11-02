package com.rakovets.course.javabasics.practice.exceptionhandling;

public class Task7 {
    public static void doDivisionByRandomDigital() throws ArithmeticException {
        int randomDigital = (int) (Math.random() * 2);
        System.out.println(randomDigital);
        int result = 1000 / randomDigital;
        System.out.println("1000 / " + randomDigital + " = " + result);
    }
}
