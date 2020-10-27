package com.rakovets.course.javabasics.practice.jcf.collection;

import com.rakovets.course.javabasics.example.collections.StringCollectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StringCollectionUtilTest {

    @Test
    void resetWordsByLengthTest() {
        String[] strings = new String []{"we", "this", "computer", "mark", "lamp", "you", "winter", "me"};
        String[] array1 = new String[]{"we", "*", "computer", "*", "*", "you", "winter", "me"};
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arrayList.add(strings[i]);
        }
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        ArrayList<String> result = stringCollectionUtil.resetWordsByLength(arrayList, 4);
        Assertions.assertArrayEquals(array1, result.toArray());

    }

    @Test
    void removeWordsByLengthTest() {
        String[] strings = new String []{"we", "this", "computer", "mark", "lamp", "you", "winter", "me"};
        String[] array1 = new String[]{"we", "computer", "you", "winter", "me"};
        ArrayList<String> arrayList = new ArrayList<>();
        for (String string : strings) {
            arrayList.add(string);
        }
        StringCollectionUtil stringCollectionUtil = new StringCollectionUtil();
        ArrayList<String> result = stringCollectionUtil.removeWordsByLength(arrayList, 4);
        Assertions.assertArrayEquals(array1, result.toArray());
    }
}
