package com.rakovets.course.javabasics.example.collections;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private int yearManufacture;
    private String registrationNumber;

    public Car (){
    }

    public Car (String brand,String model, String color, int yearManufacture, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearManufacture = yearManufacture;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object object) {
        return (this.getBrand().equals(brand) &&
                this.getModel().equals(model) &&
                this.getRegistrationNumber().equals(registrationNumber));
    }

    @Override
    public int hashCode() {
        return (this.getRegistrationNumber().compareTo(this.getBrand()) + this.getModel().compareTo(this.getColor()));
    }

    @Override
    public String toString() {
        return "Car: brand: " + brand + ", model: " + model + ", color: " + color + ", year: " + yearManufacture + ", registration number " + registrationNumber + '.';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
