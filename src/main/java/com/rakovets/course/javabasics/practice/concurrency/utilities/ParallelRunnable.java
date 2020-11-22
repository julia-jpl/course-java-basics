package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.ArrayList;
import java.util.List;

public class ParallelRunnable implements Runnable{
    private List<Integer[]> list;

    public ParallelRunnable(List<Integer[]> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ImprovedParallelCalculator.getArrayAndMaxArrayElement(list);
    }
}
