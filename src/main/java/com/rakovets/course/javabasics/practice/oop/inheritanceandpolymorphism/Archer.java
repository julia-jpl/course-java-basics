package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Archer extends Hero {
    protected boolean poisonedArrow;

    public Archer(String name) {
        super(name);
    }
    public Archer(String name, double health) {
        super(name,health);
    }
    public Archer(String name, double health, boolean poisonedArrow) {
        super(name,health);
        this.poisonedArrow = poisonedArrow;
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

    public double takeMortalDamage(Golem golem) {
        if (poisonedArrow) {
            return golem.takeDamage(1000);
        } else {
            return golem.takeDamage(20 * 3);
        }
    }
}