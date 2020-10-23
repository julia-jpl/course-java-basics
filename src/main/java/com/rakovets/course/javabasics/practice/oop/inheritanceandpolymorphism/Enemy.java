package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Enemy implements Mortal {
    private double health;

    public Enemy (double healthPoint) {
        health = healthPoint;
    }

    public double takeDamage(double damage) {
        return this.health - damage;
    }

    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public double attackHero(Hero hero) {
        return hero.takeDamageHero(10);
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

}
