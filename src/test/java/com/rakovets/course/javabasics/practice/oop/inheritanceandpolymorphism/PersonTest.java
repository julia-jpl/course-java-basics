package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void takeHappinessTest() {
        Person person = new Person (100);
        Person person1 = new Person(0);
        Assertions.assertEquals(90, person.takeHappiness(-10));
        Assertions.assertEquals(10, person1.takeHappiness(10));
    }
}
