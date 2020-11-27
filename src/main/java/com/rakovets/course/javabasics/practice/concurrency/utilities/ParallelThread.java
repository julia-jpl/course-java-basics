package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class ParallelThread implements Callable {
        Integer[] array;

        public ParallelThread (Integer[] array) {
            this.array = array;
        }

    @Override
    public Integer call() throws Exception {
            System.out.println("Array length is " + array.length);
            Integer sum = 0;
        for(int item : array) {
            sum +=  item;
        } return sum;
    }

        }


