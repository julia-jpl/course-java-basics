package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ZombieTest {

    @Test
    void becomeRevivedTest() {
        Zombie zombie = new Zombie(0);
        Zombie zombie1 = new Zombie(300);
        Assertions.assertEquals(500, zombie.becomeRevived());
        Assertions.assertEquals(300, zombie1.becomeRevived());
    }
}
