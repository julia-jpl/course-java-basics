package com.rakovets.course.javabasics.practice.jcf.map;

import com.rakovets.course.javabasics.example.collections.TextMonitoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
    HashMap<String, Integer> mapWords = textMonitoring.researchText("A flower is beautiful. A girl is Beautiful.");
    Assertions.assertEquals(4, textMonitoring.getCountUniqueWords(mapWords));
}

@Test
    void getUniqueWordsTest() {
    TextMonitoring textMonitoring = new TextMonitoring();
    HashMap<String, Integer> mapWords = textMonitoring.researchText("A flower is beautiful. A girl is Beautiful.");
    Collection<String> uniqueWords = textMonitoring.getUniqueWords(mapWords);
    Assertions.assertEquals("[beautiful, Beautiful, girl, flower]", uniqueWords.toString());
}
@Test
    void getTest() {
    TextMonitoring textMonitoring = new TextMonitoring();
    HashMap<String, Integer> mapWords = textMonitoring.researchText("A flower is beautiful. A girl is Beautiful.");
    Assertions.assertEquals(2, textMonitoring.get(mapWords, "A"));
    Assertions.assertEquals(2, textMonitoring.get(mapWords, "is"));
}
@Test
    void getWordFrequencyDescTest() {
    TextMonitoring textMonitoring = new TextMonitoring();
    HashMap<String, Integer> mapWords = textMonitoring.researchText("A flower is beautiful. A girl is Beautiful.");
    Map<String, Integer> sortedMap = textMonitoring.getWordFrequencyDesc(false, mapWords);
    Assertions.assertEquals("{A=2, is=2, beautiful=1, Beautiful=1, girl=1, flower=1}", sortedMap.toString());
    Assertions.assertEquals("{A=2, is=2, beautiful=1, Beautiful=1, girl=1, flower=1}", sortedMap.toString());
}
}
