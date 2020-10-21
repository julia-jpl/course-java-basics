package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersianTest {

    @Test
    void mewTest() {
        Persian persian = new Persian("Pers");
        Assertions.assertEquals("mew-mew-w-w-w", persian.mew());
    }

    @Test
    void purrTest() {
        Persian persian = new Persian("Pers");
        Assertions.assertEquals("purr-purr-r-r-r", persian.purr());
    }

    @Test
    void mewTest1() {
        Persian persian = new Persian("Pers");
        Person person = new Person(90);
        Assertions.assertEquals(50, persian.mew(person));
    }
    @Test
    void purrTest1() {
        Persian persian = new Persian("Pers");
        Person person = new Person(90);
        Assertions.assertEquals(130, persian.purr(person));
    }


}
