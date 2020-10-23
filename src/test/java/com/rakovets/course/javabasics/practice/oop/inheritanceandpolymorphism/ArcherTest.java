package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ArcherTest {
    private static Archer archer;

    @BeforeAll
    static void init() {
        archer = new Archer("Archer", 1000, false);
    }

    @Test
    void attackEnemyTest() {
        Enemy enemy = new Enemy(1000);
        Zombie zombie = new Zombie(200);
        Orc orc = new Orc(400);
        Golem golem = new Golem(100);
        Assertions.assertEquals(940, archer.attackEnemy(enemy));
        Assertions.assertEquals(140, archer.attackEnemy(zombie));
        Assertions.assertEquals(340, archer.attackEnemy(orc));
        Assertions.assertEquals(40, archer.attackEnemy(golem));
    }

    @Test
    void takeDamageHeroTest() {
        Assertions.assertEquals(950, archer.takeDamageHero(100));
    }

    @Test
    void isDeadTest() {
        Archer archer1 = new Archer("Archer1", 0, true);
        Assertions.assertFalse(archer.isDead());
        Assertions.assertTrue(archer1.isDead());
    }

    @Test
    void takeMortalDamageToGolemTest() {
        Golem golem = new Golem(1000);
        Archer archer1 = new Archer("Archer1", 1000, true);
        Assertions.assertEquals(940, archer.takeMortalDamageToGolem(golem));
        Assertions.assertEquals(0, archer1.takeMortalDamageToGolem(golem));
        Assertions.assertEquals(940, archer1.takeMortalDamageToGolem(golem));
    }
}
