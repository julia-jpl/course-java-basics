package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelCalculator {
    public static void getArrayAndMaxArrayElement(List<Integer[]> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            int maxElement = 0;
            for(int j = 0; j < list.get(i).length; j++) {
                maxElement = list.get(i)[0];
                if (maxElement < list.get(i)[j]) {
                    maxElement = list.get(i)[j];
                }
            }
            System.out.println(maxElement);
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
        int n = 0;
        for (n = 0; n < numberOfThreads; n++) {
            int finalN = n;
            int finalArraysInOneThread = arraysInOneThread;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = (finalN * finalArraysInOneThread); i < (finalN * finalArraysInOneThread + finalArraysInOneThread) && i < list.size(); i++) {
                        System.out.println(list.get(i));
                        int maxElement = list.get(i)[0];
                        for(int j = 0; j < list.get(i).length; j++) {
                            if (maxElement < list.get(i)[0]) {
                                maxElement = list.get(i)[j];
                            }
                        }
                        System.out.println(maxElement);
                    }
                }
            }).start();
        }
    }
}
