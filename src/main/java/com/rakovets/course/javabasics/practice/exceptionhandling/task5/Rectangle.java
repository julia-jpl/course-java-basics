package com.rakovets.course.javabasics.practice.exceptionhandling.task5;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.NegativeHeightWidthRectangleException;

public class Rectangle {

    public int getRectangleAreaWithException(int width, int height) throws NegativeHeightWidthRectangleException {
       try {
           if ((width < 0) || (height < 0)) {
           throw new IllegalArgumentException("The height and width can't be negative.");
           }
           return height * width;
       } catch (IllegalArgumentException e) {
           System.out.println(e.toString());
           throw new NegativeHeightWidthRectangleException(e.getMessage());
        }
    }
}

