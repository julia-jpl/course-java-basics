package com.rakovets.course.javabasics.practice.jcf.collection;

import com.rakovets.course.javabasics.practice.collection.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class StringCollectionUtilTest {
    private static Collection<String> collection;
    private static Collection<String> collectionChangedByReset;
    private static Collection<String> collectionChangedByDelete;

    @BeforeEach
    void init() {
        String[] strings = new String []{"we", "this", "computer", "mark", "lamp", "you", "winter", "me"};
        String[] strings1 = new String []{"we", "*", "computer", "*", "*", "you", "winter", "me"};
        String[] strings2 = new String []{"we", "computer", "you", "winter", "me"};
        collection = new ArrayList<>(Arrays.asList(strings));
        collectionChangedByReset = new ArrayList<>(Arrays.asList(strings1));
        collectionChangedByDelete = new ArrayList<>(Arrays.asList(strings2));
    }

    @Test
    void resetWordsByLengthTest() {
        Assertions.assertEquals(collectionChangedByReset, StringCollectionUtil.resetWordsByLength(collection, 4));
    }

    @Test
    void removeWordsByLengthTest() {
        StringCollectionUtil.removeWordsByLength(collection, 4);
        Assertions.assertEquals(collectionChangedByDelete, collection);
    }
}
