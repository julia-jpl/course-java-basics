package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Zombie extends Enemy {

    public Zombie (double health) {
        super(health);
    }

    public double getRevived() {
        if (health <= 0) {
            return health += 500;
        } else {
            return health = health;
        }
    }
}
