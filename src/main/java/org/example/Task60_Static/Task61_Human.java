package org.example.Task60_Static;

public class Task61_Human {
    private String name;
    private double height;
    public static double avgHeiht;

    public Task61_Human(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
