package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Orc extends Enemy {
    private int criticalTrick = 3;

    public Orc (double health) {
        super(health);
    }
    public Orc (double health, int criticalTrick) {
        super(health);
        this.criticalTrick = criticalTrick;
    }

    public double takeCriticalTrick(Hero hero) {
        if (criticalTrick > 0) {
            criticalTrick -= 1;
            return hero.takeDamageHero(500);
        } else {
            return hero.takeDamageHero(10);
        }
    }


    public int getCriticalTrick() {
        return criticalTrick;
    }
}
