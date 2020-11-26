package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ImprovedParallelCalculator {
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
            ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);
            for (int n = 0; n < numberOfThreads; n++) {
                executorService.execute();
            }
        }
    }
