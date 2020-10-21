package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public abstract class Hero {
    protected String name;
    protected double health;

    public Hero (String name) {
        this.name = name;
    }

    public Hero (String name, double health) {
        this.name = name;
        this.health = health;
    }

    public abstract String attackEnemy();

    public double attackEnemy(Enemy enemy) {
        return enemy.takeDamage(20);
    }

    public boolean isDead() {
        if (health <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public double takeDamageHero(double damage) {
        return health - damage;
    }

    public String getName() {
        return name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }
}
