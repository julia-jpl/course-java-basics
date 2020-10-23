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
        Enemy enemy1 = new Enemy(0);
        Assertions.assertTrue(enemy.isAlive());
        Assertions.assertFalse(enemy1.isAlive());
    }

    @Test
    void takeDamageTest() {
        Assertions.assertEquals(0, enemy.takeDamage(1000));
    }

    @Test
    void attackHeroTest() {
        Mag mag = new Mag ("Mag", 1000);
        Archer archer = new Archer("Archer", 500);
        Warrior warrior = new Warrior("Warrior", 1000);
        Assertions.assertEquals(990, enemy.attackHero(mag));
        Assertions.assertEquals(495, enemy.attackHero(archer));
        Assertions.assertEquals(985, enemy.attackHero(warrior));
    }

}