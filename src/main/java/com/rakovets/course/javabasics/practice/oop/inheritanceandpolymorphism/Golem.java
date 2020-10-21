package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Golem extends Enemy {
    protected int stoneSkin = 3;

    public Golem (double health) {
        super((health));
    }

    public double stayUndamaged() {
        if ((health > 200) && (stoneSkin > 0)) {
          return health = 500;
        } else {
            return health;
        }
    }
}
