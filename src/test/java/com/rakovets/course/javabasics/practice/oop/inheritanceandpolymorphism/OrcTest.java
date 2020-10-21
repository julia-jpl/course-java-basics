package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OrcTest {
    private static Orc orc;

    @BeforeAll
    static void init() {
        orc = new Orc(1000, 2);
    }

    @Test
    void takeCriticalTrickTest() {
        Archer archer = new Archer("Archer", 1000);
        Mag mag = new Mag("Mag", 1000);
        Warrior warrior = new Warrior("Warrior", 1000);
        Assertions.assertEquals(750, orc.takeCriticalTrick(archer));
        Assertions.assertEquals(500, orc.takeCriticalTrick(mag));
        Assertions.assertEquals(250, orc.takeCriticalTrick(warrior));
    }
}
