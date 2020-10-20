package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    void mewTest() {
        Cat cat = new Cat ("Кот");
        Assertions.assertEquals("mew", cat.mew());
    }

}
