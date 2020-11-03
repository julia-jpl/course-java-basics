package com.rakovets.course.javabasics.practice.collection;

import java.util.*;

public class StringCollectionUtil {

    public  static Collection<String> resetWordsByLength(Collection<String> collection, int sizeOfWord) {
        Collection<String> changedCollection = new LinkedList<>();
        for (String string : collection) {
            if (string.length() != sizeOfWord) {
                changedCollection.add(string);
            } else {
                changedCollection.add("*");
            }
        } return changedCollection;
    }

    public static void removeWordsByLength(Collection<String> collection, int sizeOfWord) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() == sizeOfWord) {
                iterator.remove();
            }
        }
    }
}
