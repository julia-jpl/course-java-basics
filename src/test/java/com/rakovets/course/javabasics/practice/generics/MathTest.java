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
}
