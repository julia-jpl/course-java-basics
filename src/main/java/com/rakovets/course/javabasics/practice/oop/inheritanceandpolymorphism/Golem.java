package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Golem extends Enemy {
    private int stoneSkin;

    public Golem (double health) {
        super(health);
    }
    public Golem (double health, int stoneSkin) {
        super(health);
        this.stoneSkin = stoneSkin;
    }

    public double stayUndamaged() {
        if ((getHealth() < 200) && (stoneSkin > 0)) {
            stoneSkin -= 1;
          return 500;
        } else {
            return getHealth();
        }
    }

    public int getStoneSkin() {
        return stoneSkin;
    }
}
