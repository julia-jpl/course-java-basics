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

    }
