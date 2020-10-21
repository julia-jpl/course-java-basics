package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ZombieTest {
    private static Zombie zombie;

    @BeforeAll
    static void init() {
        zombie = new Zombie(0);
    }

    @Test
    void getRevivedTest() {
        Assertions.assertEquals(500, zombie.getRevived());
    }
}
