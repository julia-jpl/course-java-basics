package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Person {
    private int happiness;

    public Person (int percentage) {
        happiness = percentage;
    }

    public int takeHappiness(int happiness) {
        return this.happiness + happiness;
    }

    public int getHappiness() {
        return this.happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
