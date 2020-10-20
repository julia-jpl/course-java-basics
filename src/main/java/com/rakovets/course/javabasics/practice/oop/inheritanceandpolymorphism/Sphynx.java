package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import java.util.SplittableRandom;

public class Sphynx extends Cat {

    public Sphynx (String name) {
        super(name);
    }

    @Override
    public String mew() {
       return super.mew() + "-mew-w-mew";
    }

    @Override
    public String purr() {
        return super.purr() + "-purr-r-purr";
    }

    @Override
    public int mew(Person person) {
        return super.mew(person) - 10;
    }

    @Override
    public int purr(Person person) {
        return super.purr(person) + 10;
    }
}
