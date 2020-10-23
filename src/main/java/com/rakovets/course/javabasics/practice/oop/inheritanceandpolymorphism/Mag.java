package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Mag extends Hero {
    private int magicPotion;

    public Mag (String name) {
        super(name);
    }

    public Mag (String name, double health) {
        super(name, health);
    }

    public Mag (String name, double health, int magicPotion) {
        super(name, health);
        this.magicPotion = magicPotion;
    }

    @Override
    public String attackEnemy() {
        return "Mag attacks enemy.";
    }

    @Override
    public double attackEnemy(Enemy enemy) {
        return enemy.takeDamage(20 * 2);
    }

    @Override
    public double takeDamageHero(double damage) {
        return super.takeDamageHero(damage);
    }

    public boolean beAbleBecomeInvisibleFor30Seconds() {
        if (magicPotion > 0) {
            magicPotion -= 1;
            return true;
        } else {
            return false;
        }
    }

    public int getMagicPotion() {
        return magicPotion;
    }
}
