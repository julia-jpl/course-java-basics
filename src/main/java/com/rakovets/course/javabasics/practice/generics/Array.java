package com.rakovets.course.javabasics.practice.generics;

import java.util.Scanner;

public class Array<T extends Numbers> {
        private int size;
        Numbers<Integer>[] array = new Numbers [size];



        public void setSize ( int size){
            this.size = size;
        }

        public int getSize () {
            return size;

        }


        public Numbers<Integer>[] fillArrayFromStandartInput() {
            Numbers<Integer>[] array = new Numbers [size];
            for (int i = 1; i < size; i++) {
                array[i] = new Numbers<Integer> (scanner);
            }
        }
        public Numbers[] fillArrayByRandom (Numbers number, int bound, int size){
            Numbers[] array1 = new Numbers[size];
            for (int i = 1; i < size; i++) {
                array1[i] = (Numbers) Math.random;
            }


        }

    }
}