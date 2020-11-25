package com.rakovets.course.javabasics.practice.javaio;

import java.io.File;

public class DirCreator {
    public static void main(String[] args) {
        File dir = new File("src" + File.separator + "test" + File.separator + "resources");
        boolean created = dir.mkdir();
        if (created) {
            System.out.println("Directory is created");
        } else {
            System.out.println("Directory is not created");
        }
    }
}
