package com.rakovets.course.javabasics.practice.concurrency.parallelcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ParallelCalculator {
    public static void getArrayAndMaxArrayElement(List<Integer[]> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Number of threads is 1: Array " + i + " length = " + list.get(i).length);
            int maxElement = 0;
            for(int j = 0; j < list.get(i).length; j++) {
                maxElement = list.get(i)[0];
                if (maxElement < list.get(i)[j]) {
                    maxElement = list.get(i)[j];
                }
            }
            System.out.println("Number of threads is 1. Max element of array " + i + " = " + maxElement);
        }
    }
    public static List<Integer[]> getListOfArraysWithRandomDigital(int listSize) {
        List<Integer[]> list = new ArrayList<>();
        for (int i = 1; i <= listSize; i++) {
            int arrayLength = (int) (Math.random() * 1_000_000 + 1);
            Integer[] array = new Integer [arrayLength];
            for (int j = 0; j < array.length; j++) {
                array[j] = (int) (Math.random() * 300);
            }
            list.add(array);
        }
        return list;
    }

    public static void getCalculationInSeveralThreads(int numberOfThreads, List<Integer[]> list) {
        int arraysInOneThread = 0;
        if (list.size() % numberOfThreads == 0) {
            arraysInOneThread = list.size() / numberOfThreads;
        } else {
            arraysInOneThread = list.size() / numberOfThreads + 1;
        }
        for (int n = 0; n < numberOfThreads; n++) {
            Thread parallelThread = new Thread(new ParallelThreads(numberOfThreads, list, n));
            parallelThread.start();
            try {
                parallelThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
