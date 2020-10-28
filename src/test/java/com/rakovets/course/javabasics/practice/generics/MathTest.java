package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void getMaxTest() {
        Assertions.assertEquals(123, Math.<Integer>getMax(1, 2, 123));
        Assertions.assertEquals("we", Math.<String>getMax("12", "34", "we"));
        Assertions.assertEquals(null, Math.<Integer>getMax(2, 2, 2));
        Assertions.assertEquals(23, Math.<Integer>getMax(22, 22, 23));
        Assertions.assertEquals("we", Math.<String>getMax("22", "we", "we"));

    }

    @Test
    void getMinTest() {
        Assertions.assertEquals(2, Math.<Integer>getMin(56, 8, 0, 2, 7));
        Assertions.assertEquals(null, Math.<Integer>getMin(1, 1, 1, 1, 1));
        Assertions.assertEquals("12", Math.<String>getMin("12", "12", "23", "34", "12"));
    }

    @Test
    void getAverageTest() {
        Integer[] numbers1 = new Integer[] {1, 2, 3, 4, 5};
        Math<Integer> array1 = new Math (numbers1);
        Assertions.assertEquals(3.0, array1.<Integer>getAverage(numbers1));
        Double[] numbers2 = new Double[] {1.6, 2.9, 3.5, 4.8, 5.0};
        Math<Integer> array2 = new Math (numbers2);
        Assertions.assertEquals(3.56, array1.<Double>getAverage(numbers2));
    }

    @Test
    void getMaxInArrayTest() {
        Integer[] numbers1 = new Integer[] {1, 2, 3, 4, 5};
        Math<Integer> array1 = new Math (numbers1);
        Assertions.assertEquals(5, array1.getMaxInArray(numbers1));
    }

    @Test
    void getMinInArrayTest() {
        Integer[] numbers1 = new Integer[] {1, 2, 3, 4, 5};
        Math<Integer> array1 = new Math (numbers1);
        Assertions.assertEquals(1, array1.getMinInArray(numbers1));
    }

    @Test
    void getSortArrayTest() {
        Integer[] numbers1 = new Integer[] {5, 3, 6, 2, 3};
        Math<Integer> array1 = new Math (numbers1);
        Assertions.assertArrayEquals(new Integer[]{2, 3, 3, 5, 6}, array1.getSortArray(numbers1));
    }

    @Test
    void getBinarySearchTest() {
        Integer[] numbers1 = new Integer[] {1, 2, 3, 4, 6, 10, 33};
        Math<Integer> array1 = new Math (numbers1);
        Assertions.assertEquals(6, array1.getBinarySearch(numbers1, 33));
        Double[] numbers2 = new Double[] {1.0, 3.0, 4.0, 5.0, 7.0};
        Math<Double> array2 = new Math (numbers2);
        Assertions.assertEquals(-1, array2.getBinarySearch(numbers2, 6.0));
        Integer[] numbers3 = new Integer[] {1, 3, 6, 6, 7};
        Math<Integer> array3 = new Math (numbers3);
        Assertions.assertEquals(2, array3.getBinarySearch(numbers3, 6));
        Integer[] numbers4 = new Integer[0];
        Math<Integer> array4 = new Math (numbers4);
        Assertions.assertEquals(-1, array4.getBinarySearch(numbers4, 6));
        Integer[] numbers5 = new Integer[] {1, 3};
        Math<Integer> array5 = new Math (numbers5);
        Assertions.assertEquals(1, array5.getBinarySearch(numbers5, 3));
    }
}


