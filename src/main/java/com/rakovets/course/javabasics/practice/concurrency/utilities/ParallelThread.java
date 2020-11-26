package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.List;
import java.util.concurrent.Future;

public class ParallelThread implements Runnable {
        Integer[] array;

        public ParallelThread (Integer[] array) {
            this.array = array;
        }

        @Override
        public void run () {
                long sum = 0;
                for(int item : array) {
                    sum += item;
                }
        }
        }


