package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MagTest {

    private Mag mag;

    @BeforeEach
    void init() {
        mag = new Mag("Zorg", 1000, 2);
    }

    @Test
    void attackEnemyTest() {
        Enemy enemy = new Enemy(120);
        Zombie zombie = new Zombie(200);
        Orc orc = new Orc(400);
        Golem golem = new Golem(100);
        Assertions.assertEquals(80, mag.attackEnemy(enemy));
        Assertions.assertEquals(160, mag.attackEnemy(zombie));
        Assertions.assertEquals(360, mag.attackEnemy(orc));
        Assertions.assertEquals(60, mag.attackEnemy(golem));
    }

    @Test
    void takeDamageHeroTest() {
        Mag mag1 = new Mag("Mag1", 200,2);
        Assertions.assertEquals(860, mag.takeDamageHero(140));
        Assertions.assertEquals(150, mag1.takeDamageHero(50));
    }

    @Test
    void isDeadTest() {
        Mag mag1 = new Mag("Mag1", -100, 1);
        Assertions.assertFalse(mag.isDead());
        Assertions.assertTrue(mag1.isDead());
    }

    @Test
    void beAbleBcomeInvisibleFor30SecondsTest() {
        Mag mag1 = new Mag("Mag1", -100, 0);
        Assertions.assertFalse(mag1.beAbleBecomeInvisibleFor30Seconds());
        Assertions.assertTrue(mag.beAbleBecomeInvisibleFor30Seconds());
        Assertions.assertTrue(mag.beAbleBecomeInvisibleFor30Seconds());
        Assertions.assertFalse(mag.beAbleBecomeInvisibleFor30Seconds());
    }
}
