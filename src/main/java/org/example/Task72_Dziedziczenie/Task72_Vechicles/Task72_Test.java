package org.example.Task72_Dziedziczenie.Task72_Vechicles;

public class Task72_Test {
    public static void main(String[] args) {
        Task72_Car car1 = new Task72_Car();
        car1.setDoors(5);
        car1.setWheels(4);
        car1.setEngine(new Task72_Engine(120, "Disel"));
        car1.setFuel(40);

        car1.printInfo();
    }
}
