package org.example.Task13_MetodyKonstruktory;

public class Task15_Console {
    String model;
    int capacity;

    Task15_Console(String m, int c) {
        model = m;
        capacity = c;
        System.out.println("\n ## Tworze konsole");
    }

    void printInfo() {
        System.out.println(model + " " + capacity);
    }
}
