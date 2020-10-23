package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    private static Warrior warrior;

    @BeforeAll
    static void init(){
        warrior = new Warrior("Warrior", 1000);
    }
    @Test
    void attackEnemyTest() {
        Enemy enemy = new Enemy(1000);
        Zombie zombie = new Zombie(200);
        Orc orc = new Orc(400);
        Golem golem = new Golem(100);
        Assertions.assertEquals(970, warrior.attackEnemy(enemy));
        Assertions.assertEquals(170, warrior.attackEnemy(zombie));
        Assertions.assertEquals(370, warrior.attackEnemy(orc));
        Assertions.assertEquals(70, warrior.attackEnemy(golem));
    }

    @Test
    void takeDamageHeroTest() {
        Assertions.assertEquals(970, warrior.takeDamageHero(20));
        Warrior warrior1 = new Warrior("Warrior1", 200);
        Assertions.assertEquals(125, warrior1.takeDamageHero(50));
    }

    @Test
    void isDeadTest() {
        Assertions.assertFalse(warrior.isDead());
        Warrior warrior1 = new Warrior("Warrior1", 0);
        Assertions.assertTrue(warrior1.isDead());
    }

    @Test
    void beAbleToFlyTest() {
        Assertions.assertEquals(true, warrior.beAbleToFly());
        Warrior warrior1 = new Warrior("Warrior1", 500);
        Assertions.assertFalse(warrior1.beAbleToFly());
    }
}
