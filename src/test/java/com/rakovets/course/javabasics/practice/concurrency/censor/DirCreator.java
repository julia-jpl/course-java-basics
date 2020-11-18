package com.rakovets.course.javabasics.practice.concurrency.censor;

import java.io.File;

public class DirCreator {
    public static void main(String[] args) {
        File directory = new File("E:" + File.separator + "home" + File.separator +"portnova" + File.separator + "course-java-basics" + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "dirfortests");
        directory.mkdir();
    }
}
