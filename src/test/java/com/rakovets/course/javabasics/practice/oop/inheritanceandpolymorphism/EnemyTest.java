package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EnemyTest {
    private static Enemy enemy;

    @BeforeAll
    static void init() {
        enemy = new Enemy(1000);
    }

    @Test
    void isAliveTest() {
        Assertions.assertEquals(true, enemy.isAlive());
    }

    @Test
    void takeDamageTest() {
        Assertions.assertEquals(0, enemy.takeDamage(1000));
    }

    @Test
    void attackHeroTest() {
        Mag mag = new Mag ("Mag", 1000);
        Assertions.assertEquals(990, enemy.attackHero(mag));
    }

}