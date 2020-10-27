package com.rakovets.course.javabasics.example.collections;

public class Actor implements Comparable<Actor> {
    private String firstname;
    private String lastname;
    private int fee;
    private int age;


    public int compareTo(Actor actor) {
            return this.getFee() - actor.getFee();
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
