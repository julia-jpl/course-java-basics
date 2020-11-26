package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.List;

public class ImprovedParallelCalculatorDemo {
    public static void main(String[] args) {
        List<Integer[]> list = ImprovedParallelCalculator.getListOfArraysWithRandomDigital(10);
        ImprovedParallelCalculator.getCalculationInSeveralThreads(2, list);
    }
}
