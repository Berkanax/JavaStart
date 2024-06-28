package org.example.Task72_Dziedziczenie.Task72_Vechicles;

public class Task72_Vehicle {
    private Task72_Engine engine;
    private double fuel; // Poziom Paliwa

    public Task72_Engine getEngine() {
        return engine;
    }

    public void setEngine(Task72_Engine engine) {
        this.engine = engine;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
