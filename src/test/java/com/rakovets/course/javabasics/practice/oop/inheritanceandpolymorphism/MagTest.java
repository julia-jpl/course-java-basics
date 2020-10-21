package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MagTest {

    private Mag mag;

    @BeforeEach
    void init() {
        mag = new Mag("Zorg", 1000);
    }

    @Test
    void attackEnemyTest() {
        Enemy enemy = new Enemy(120);
        Assertions.assertEquals(80, mag.attackEnemy(enemy));
    }
    @Test
    void takeDamageHeroTest() {
        Assertions.assertEquals(860, mag.takeDamageHero(140));
    }

    @Test
    void isDeadTest() {
        Assertions.assertEquals(false, mag.isDead());
    }
}
