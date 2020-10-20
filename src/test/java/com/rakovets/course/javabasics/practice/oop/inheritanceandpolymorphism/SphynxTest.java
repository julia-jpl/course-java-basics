package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    @Test
    void mewTest() {
        Sphynx sphynx = new Sphynx("Shy");
        Assertions.assertEquals("mew-mew-w-mew", sphynx.mew());
    }

    @Test
    void purrTest() {
        Sphynx sphynx = new Sphynx("Shy");
        Assertions.assertEquals("purr-purr-r-purr", sphynx.purr());
    }

    @Test
    void purrTest1() {
        Sphynx sphynx = new Sphynx("Shy");
        Person person = new Person(90);
        Assertions.assertEquals(120, sphynx.purr(person));
    }

    @Test
    void mewTest1() {
        Sphynx sphynx = new Sphynx("Shy");
        Person person = new Person(90);
        Assertions.assertEquals(60, sphynx.mew(person));
    }
}
