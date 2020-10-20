package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Persian extends Cat {

    public Persian (String name) {
        super (name);
    }

    @Override
    public String mew() {
       return super.mew() + "mew-w-w-w";
    }

    @Override
    public String purr() {
        return super.purr() + "purr-r-r-r";
    }
}
