package org.example.Task01_HelloWorld;

public class Task05_01 {
    String brand;
    String model;
    int yearbook;
    double price;

    public Task05_01(String brand, String model, int yearbook, double price) {
        this.brand = brand;
        this.model = model;
        this.yearbook = yearbook;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Yearbook: " + yearbook + ", Price: " + price;
    }
}
