package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GolemTest {
    private static Golem golem;

    @BeforeAll
    static void init() {
        golem = new Golem(180, 2);
    }
    @Test
    void stayUndamaged(){
        Golem golem1 = new Golem(300, 1);
        Golem golem2 = new Golem(100, 0);
        Assertions.assertEquals(500, golem.stayUndamaged());
        Assertions.assertEquals(500, golem.stayUndamaged());
        Assertions.assertEquals(180, golem.stayUndamaged());
        Assertions.assertEquals(300, golem1.stayUndamaged());
        Assertions.assertEquals(100, golem2.stayUndamaged());
    }
}
