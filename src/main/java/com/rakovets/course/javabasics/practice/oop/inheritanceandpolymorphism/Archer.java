package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy() {
        System.out.println("Mag attacks enemy.");
    }

    @Override
    public double attackEnemy(Enemy enemy) {
        return enemy.takeDamage(20 * 3);
    }
}