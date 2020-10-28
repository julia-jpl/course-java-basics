package com.rakovets.course.javabasics.practice.jcf.map;

import com.rakovets.course.javabasics.example.collections.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TextMonitoringTest {
@Test
    void researchTextTest() {
    TextMonitoring textMonitoring = new TextMonitoring();
    HashMap<String, Integer> mapWords = textMonitoring.researchText("Flower is beautiful. Girl is Beautiful.");
    Assertions.assertEquals(2 , mapWords.get("is"));
}
@Test
    void getCountUniqueWordsTest() {
    TextMonitoring textMonitoring = new TextMonitoring();
    HashMap<String, Integer> mapWords = textMonitoring.researchText("Flower is beautiful. Girl is Beautiful.");
    Assertions.assertEquals(4, textMonitoring.getCountUniqueWords(mapWords));

}
}
