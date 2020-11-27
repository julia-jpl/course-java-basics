package com.rakovets.course.javabasics.practice.concurrency.utilities.parallelcalculator;

import com.rakovets.course.javabasics.practice.concurrency.utilities.parallelcalculator.ImprovedParallelCalculator;

import java.util.List;

public class ImprovedParallelCalculatorDemo {
    public static void main(String[] args) {
        List<Integer[]> list = ImprovedParallelCalculator.getListOfArraysWithRandomDigital(10);
        ImprovedParallelCalculator.getCalculationInSeveralThreads(1, list);
        ImprovedParallelCalculator.getCalculationInSeveralThreads(2, list);
        ImprovedParallelCalculator.getCalculationInSeveralThreads(5, list);
        ImprovedParallelCalculator.getCalculationInSeveralThreads(10, list);
    }
}
