package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void getMaxTest() {
        Assertions.assertEquals(123, Math.getMax(1, 2, 123));
        Assertions.assertEquals("we", Math.getMax("12", "34", "we"));
        Assertions.assertEquals(null, Math.getMax(2, 2, 2));
        Assertions.assertEquals(23, Math.getMax(22, 22, 23));
        Assertions.assertEquals("we", Math.getMax("22", "we", "we"));

    }

    @Test
    void getMinTest() {
        Assertions.assertEquals(2, Math.getMin(56, 8, 0, 2, 7));
        Assertions.assertEquals(null, Math.getMin(1, 1, 1, 1, 1));
        Assertions.assertEquals("12", Math.getMin("12", "12", "23", "34", "12"));
    }

    @Test
    void getAverageTest() {
        Integer[] numbers1 = new Integer[] {1, 2, 3, 4, 5};
        Math<Integer> array1 = new Math (numbers1);
        Assertions.assertEquals(3.0, array1.getAverage(numbers1));
        Double[] numbers2 = new Double[] {1.6, 2.9, 3.5, 4.8, 5.0};
        Math<Integer> array2 = new Math (numbers2);
        Assertions.assertEquals(3.56, array1.getAverage(numbers2));
    }

    @Test
    void getMaxInArrayTest() {
        Integer[] numbers1 = new Integer[] {1, 2, 3, 4, 5};
        Math<Integer> array1 = new Math (numbers1);
        Assertions.assertEquals(5, array1.getMaxInArray(numbers1));
    }
}
