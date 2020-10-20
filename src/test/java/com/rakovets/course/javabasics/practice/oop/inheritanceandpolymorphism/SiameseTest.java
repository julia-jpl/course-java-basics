package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SiameseTest {
    @Test
    void mewTest() {
        Siamese siamese = new Siamese("Siam");
        Assertions.assertEquals("mew-mew-mew", siamese.mew());
    }

    @Test
    void purrTest() {
        Siamese siamese = new Siamese("Siam");
        Assertions.assertEquals("purr-purr-purr", siamese.purr());
    }

    @Test
    void mewTest1() {
        Siamese siamese = new Siamese("Siam");
        Person person = new Person(90);
        Assertions.assertEquals(65, siamese.mew(person));
    }
    @Test
    void purrTest1() {
        Siamese siamese = new Siamese("Siam");
        Person person = new Person(90);
        Assertions.assertEquals(115, siamese.purr(person));
    }
}