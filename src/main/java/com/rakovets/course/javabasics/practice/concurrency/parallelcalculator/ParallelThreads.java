package com.rakovets.course.javabasics.practice.concurrency.parallelcalculator;

import java.util.Collections;
import java.util.List;

public class ParallelThreads implements Runnable {
    int numberOfThreads;
    List<Integer[]> list;
    int n;
    public ParallelThreads (int numberOfThreads, List<Integer[]> list, int n) {
        this.numberOfThreads = numberOfThreads;
        this.list = list;
        this.n = n;
    }

    @Override
    public void run() {
        int arraysInOneThread = 0;
        if (list.size() % numberOfThreads == 0) {
            arraysInOneThread = list.size() / numberOfThreads;
        } else {
            arraysInOneThread = list.size() / numberOfThreads + 1;
        }
        for (int i = (n * arraysInOneThread); (i < (n * arraysInOneThread + arraysInOneThread)) && (i < list.size()); i++) {
            System.out.println("Number of threads is " + numberOfThreads + " " + list.get(i).toString());
            int maxElement = list.get(i)[0];
            for(int j = 0; j < list.get(i).length; j++) {
                if (maxElement < list.get(i)[0]) {
                    maxElement = list.get(i)[j];
                }
            }
            System.out.println("Number of threads is " + numberOfThreads + " " + ". Max element of array " + i + " = " + maxElement);
        }
    }
}
