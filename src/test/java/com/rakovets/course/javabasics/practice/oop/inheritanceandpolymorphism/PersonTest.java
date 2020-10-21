package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void takeHappiness1Test() {
        Person person = new Person (100);
        Assertions.assertEquals(90, person.takeHappiness(-10));
    }
    @Test
    void takeHappiness2Test() {
        Person person = new Person (100);
        Assertions.assertEquals(110, person.takeHappiness(10));
    }
}
