package org.example.Task72_Dziedziczenie.Task72_Vechicles;

public class Task72_Engine {
    private int power; // Moc silnika
    private String type; // Typ silniaka

    public Task72_Engine(int power, String type) {
        this.power = power;
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
