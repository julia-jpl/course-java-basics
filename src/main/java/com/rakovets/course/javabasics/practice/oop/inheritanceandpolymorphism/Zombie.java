package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Zombie extends Enemy {

    public Zombie (double health) {
        super(health);
    }

    public double becomeRevived() {
        if (getHealth() <= 0) {
            return 500;
        } else {
            return getHealth();
        }
    }
}
