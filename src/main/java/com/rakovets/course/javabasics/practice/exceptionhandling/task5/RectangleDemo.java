package com.rakovets.course.javabasics.practice.exceptionhandling.task5;

import com.rakovets.course.javabasics.practice.exceptionhandling.exceptions.NegativeHeightWidthRectangleException;

public class RectangleDemo {
    public static void main(String[] args) throws NegativeHeightWidthRectangleException {
        Rectangle rectangle = new Rectangle();
        try {
            rectangle.getRectangleAreaWithException(-2, 15);
         } catch (NegativeHeightWidthRectangleException ex) {
            System.out.println(ex.toString());
        }
    }
}
