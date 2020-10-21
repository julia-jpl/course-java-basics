package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArcherTest {
    private static Archer archer;

    @BeforeAll
    static void init() {
        archer = new Archer("Archer", 1000, true);
    }

    @Test
    void attackEnemy() {
        Enemy enemy = new Enemy(1000);
        Assertions.assertEquals(940, archer.attackEnemy(enemy));
    }

    @Test
    void takeDamageHero() {
        Assertions.assertEquals(950, archer.takeDamageHero(100));
    }

    @Test
    void isDeadTest() {
        Assertions.assertEquals(false, archer.isDead());
    }

    @Test
    void takeMortalDamage() {
        Golem golem = new Golem(1000);
        Assertions.assertEquals(0, archer.takeMortalDamage(golem));
    }
}
