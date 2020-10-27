package com.rakovets.course.javabasics.example.collections;

import java.util.ArrayList;

public class StringCollectionUtil {

    public ArrayList<String> resetWordsByLength(ArrayList<String> arraylist, int size) {
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i).length() == size) {
                arraylist.set(i, "*");
            }
        } return arraylist;
    }

    public ArrayList<String> removeWordsByLength(ArrayList<String> arraylist, int size) {
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i).length() == size) {
                arraylist.remove(i);
            }
        } return arraylist;
    }

}
