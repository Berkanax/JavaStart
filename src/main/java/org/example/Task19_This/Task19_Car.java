package org.example.Task19_This;

public class Task19_Car {
    int year;
    String brand;
    String model;
    String color;

    Task19_Car(int year, String brand, String model, String color){
        this(year, brand, model);
        this.color = color;
        System.out.println("Kontruktor 1");
    }
    Task19_Car(int year, String brand, String model){// kontruktor 2
        this.year = year;
        this.brand = brand;
        this.model = model;
        System.out.println("Kontruktor 2");
    }
}
