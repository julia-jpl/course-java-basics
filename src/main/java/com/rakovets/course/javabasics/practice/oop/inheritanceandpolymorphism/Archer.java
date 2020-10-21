package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Archer extends Hero {

    public Archer(String name) {
        super(name);
    }
    public Archer(String name, double health) {
        super(name,health);
    }

    @Override
    public String attackEnemy() {
        return "Mag attacks enemy.";
    }

    @Override
    public double attackEnemy(Enemy enemy) {
        return enemy.takeDamage(20 * 3);
    }

    @Override
    public double takeDamageHero(double damage) {
        return super.takeDamageHero(damage * 0.5);
    }
}