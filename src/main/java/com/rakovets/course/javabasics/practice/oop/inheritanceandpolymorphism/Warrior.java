package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Warrior extends Hero {

    public Warrior (String name) {
        super(name);
    }

    public Warrior (String name, double health) {
        super(name, health);
    }

    @Override
    public String attackEnemy() {
        return "Warrior attacks enemy.";
    }

    @Override
    public double attackEnemy(Enemy enemy) {
        return enemy.takeDamage(20 * 1.5);
    }

    @Override
    public double takeDamageHero(double damage) {
        return super.takeDamageHero(damage * 1.5);
    }

    public boolean beAbleToFly() {
        if (getHealth() > 500) {
            return true;
        } else {
            return false;
        }
    }
}

