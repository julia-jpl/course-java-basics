package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Orc extends Enemy {
    protected int criticalTrick = 3;

    public Orc (double health) {
        super(health);
    }
    public Orc (double health, int criticalTrick) {
        super(health);
        this.criticalTrick = criticalTrick;
    }

    public double takeCriticalTrick(Hero hero) {
        if (criticalTrick > 0) {
            return hero.takeDamageHero(500);
        } else {
            return hero.takeDamageHero(10);
        }
    }

    public int takeCriticalTrick() {
        return criticalTrick - 1;
    }
}
