package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Persian extends Cat {

    public Persian (String name) {
        super (name);
    }

    @Override
    public String mew() {
       return super.mew() + "-mew-w-w-w";
    }

    @Override
    public String purr() {
        return super.purr() + "-purr-r-r-r";
    }

    @Override
    public int mew(Person person) {
        return super.mew(person) - 20;
    }

    @Override
    public int purr(Person person) {
        return super.purr(person) + 20;
    }
}
