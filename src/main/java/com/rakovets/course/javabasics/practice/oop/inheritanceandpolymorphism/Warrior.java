package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Warrior extends Hero {

    public Warrior (String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Warrior attacks enemy.");
    }

    @Override
    public double attackEnemy(Enemy enemy) {
        return enemy.takeDamage(20 * 1.5);
    }
}
