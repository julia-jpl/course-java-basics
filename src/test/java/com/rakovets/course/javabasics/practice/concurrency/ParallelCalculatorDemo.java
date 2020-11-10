package com.rakovets.course.javabasics.practice.concurrency;

import java.util.List;

public class ParallelCalculatorDemo {
    public static void main(String[] args) {
        List<Integer[]> list10 = ParallelCalculator.getListOfArraysWithRandomDigital(10);

        long startTime = System.currentTimeMillis();
        ParallelCalculator.getArrayAndMaxArrayElement(list10);
        long spentTime = System.currentTimeMillis() - startTime;
        System.out.println("Calculation spends " + spentTime + " millis.");

        long startTime2Treads = System.currentTimeMillis();
        ParallelCalculator.getCalculationInSeveralThreads(2, list10);
        long spentTime2Threads = System.currentTimeMillis() - startTime2Treads;
        System.out.println("Calculation in 2 threads spends " + spentTime2Threads + " millis.");

        long startTime5Threads = System.currentTimeMillis();
        ParallelCalculator.getCalculationInSeveralThreads(5, list10);
        long spentTime5Threads = System.currentTimeMillis() - startTime5Threads;
        System.out.println("Calculation in 5 threads spends " + spentTime5Threads + " millis.");

        long startTime10Threads = System.currentTimeMillis();
        ParallelCalculator.getCalculationInSeveralThreads(10, list10);
        long spentTime10Threads = System.currentTimeMillis() - startTime10Threads;
        System.out.println("Calculation in 10 threads spends " + spentTime10Threads + " millis.");
    }
}
