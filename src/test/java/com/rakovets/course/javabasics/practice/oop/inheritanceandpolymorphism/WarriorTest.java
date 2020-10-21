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
        Assertions.assertEquals(970, warrior.attackEnemy(enemy));
    }

    @Test
    void takeDamageHero() {
        Assertions.assertEquals(970, warrior.takeDamageHero(20));
    }

    @Test
    void isDeadTest() {
        Assertions.assertEquals(false, warrior.isDead());
    }
}
