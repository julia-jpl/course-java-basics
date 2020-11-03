package com.rakovets.course.javabasics.practice.map.garage;

import com.rakovets.course.javabasics.practice.map.garage.Car;

import java.util.*;

public class Garage {
    private Map<String, List<Car>> map;

    public Garage(Map<String, List<Car>> map) {
        this.map = new HashMap<>();
    }

    public Map<String, List<Car>> park(Car car) {
        String key = car.getBrand() + car.getModel();
        if (!map.containsKey(key)) {
            List<Car> list = new ArrayList<>();
            list.add(car);
            map.put(key, list);
        } else {
            map.get(key).add(car);
        }
        return map;
    }

    public Map<String, List<Car>> leave(Car car) {
        String key = car.getBrand() + car.getModel();
        if (map.containsKey(key)) {
            map.get(key).remove(car);
        }
        return map;
    }

    public int getCount(String brand, String model) {
        String key = brand + model;
        if (map.containsKey(key)) {
            return map.get(key).size();
        } else {
            return 0;
        }
    }

    public boolean isExist(String registrationNumber) {
        boolean result = false;
        for (List<Car> item : map.values()) {
            for (Car car : item) {
                if (registrationNumber.equals(car.getRegistrationNumber())) {
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean isExist(String brand, String model, String registrationNumber) {
        String key = brand + model;
        if (map.containsKey(key)) {
            return isExist(registrationNumber);
        } else {
            return false;
        }
    }

    public Car getByRegistrationNumber(String registrationNumber) {
        Car result = null;
        for (List<Car> item : map.values()) {
            for (Car car : item) {
                if (registrationNumber.equals(car.getRegistrationNumber())) {
                    result = car;
                }
            }
        }
        return result;
    }
}
