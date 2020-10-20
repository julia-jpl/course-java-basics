package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Siamese extends Cat {

    public Siamese (String name) {
        super (name);
    }

    @Override
    public String mew() {
        return super.mew() + "mew-mew";
    }

    @Override
    public String purr() {
        return super.purr() +"purr-purr";
    }
}
