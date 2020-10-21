package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GolemTest {
    private static Golem golem;

    @BeforeAll
    static void init() {
        golem = new Golem(180, 3);
    }
    @Test
    void stayUndamaged(){
        Assertions.assertEquals(500, golem.stayUndamaged());
    }
}
