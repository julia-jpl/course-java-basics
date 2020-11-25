package com.rakovets.course.javabasics.practice.javaio.computerrepairworkshop;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ComputerDemoDeserialization {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src" + File.separator + "test" + File.separator +"resources" + File.separator + "computer.data"))) {
            try {
                Computer comp = (Computer) ois.readObject();
                System.out.printf("Computer: brand %s \t model: %s \t serial number: %s \n", comp.getBrand(), comp.getModel(), comp.getSerialNumber());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
