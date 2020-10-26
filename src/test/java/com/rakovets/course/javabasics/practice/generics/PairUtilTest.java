package com.rakovets.course.javabasics.practice.generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairUtilTest {

    @Test
    void swapTest() {
        PairUtil<String, Integer> stringIntegerPairutil = new PairUtil<>();
        Pair<String, Integer> origin = new Pair<>("123", 123);
        Pair<Integer, String> swaped = stringIntegerPairutil.swap(origin);
        Assertions.assertEquals(origin.getKey(), swaped.getValue());
        Assertions.assertEquals(origin.getValue(), swaped.getKey());
    }
}
