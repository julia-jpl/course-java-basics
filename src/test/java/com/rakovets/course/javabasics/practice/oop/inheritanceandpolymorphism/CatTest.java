package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

public class CatTest {
    @Test
    void mewTest() {
        Cat cat = new Cat ("Кот");
        Assertions.assertEquals("mew", cat.mew());
    }

    @Test
    void purrTest() {
        Cat cat = new Cat ("Кот");
        Assertions.assertEquals("purr", cat.purr());
    }
    @Test
    void purrTest1() {
        Cat cat = new Cat ("Кот");
        Person person = new Person(90);
        Assertions.assertEquals(110, cat.purr(person));
    }
    @Test
    void mewTest1() {
        Cat cat = new Cat("Кот");
        Person person = new Person(90);
        Assertions.assertEquals(70, cat.mew(person));
    }

};



