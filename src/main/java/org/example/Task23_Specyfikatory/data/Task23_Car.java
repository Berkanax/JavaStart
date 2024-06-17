package org.example.Task23_Specyfikatory.data;

public class Task23_Car {
    private int year;
    private String brand;
    private String model;
    private String color;

    public Task23_Car(int year, String brand, String model, String color){
        this(year, brand, model);
        this.color = color;
        System.out.println("Kontruktor 1");
    }
    public Task23_Car(int year, String brand, String model){// kontruktor 2
        this.year = year;
        this.brand = brand;
        this.model = model;
        System.out.println("Kontruktor 2");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 2015 && year <= 2025)
            this.year = year;
        else
            System.out.println("Rok niepoprawny");
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
}
