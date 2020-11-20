package com.rakovets.course.javabasics.practice.concurrency.censor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResetRunnableTest {
    private List<String> forbiddenWords;

    @BeforeEach
    void init(){
        String[] fwArray = new String[] {"six", "Sun", "she", "seven"};
        forbiddenWords = Arrays.asList(fwArray);
    }
    @Test
    void getForbiddenWordsTest() {
        Assertions.assertEquals(forbiddenWords, ResetRunnable.getForbiddenWords("E:" + File.separator + "home" + File.separator + "portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "forbiddenwords.txt"));
    }

}
