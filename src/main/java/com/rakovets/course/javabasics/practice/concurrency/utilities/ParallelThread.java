package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.List;

public class ParallelThread implements Runnable {
        int numberOfThreads;
        List<Integer[]> list;
        int n;
        public ParallelThread (int numberOfThreads, List<Integer[]> list, int n) {
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
                System.out.println("Number of threads is " + numberOfThreads + ". Array " + i + " length is " + list.get(i).length);
                long sum = 0;
                for(int j = 0; j < list.get(i).length; j++) {
                    sum += list.get(i)[j];
                }
                System.out.println("Number of threads is " + numberOfThreads + ". Thread " + Thread.currentThread().getName() + ". The sum of all elements of array " + i + " = " + sum);
            }
        }
    }

