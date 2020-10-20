package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Cat {
    private String name;

    public Cat (String name) {
    this.name = name;
    }

    public String mew() {
        return "mew";
    }

    public String purr() {
        return "purr";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
