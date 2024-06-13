package org.example.Task13_MetodyKonstruktory;

import org.w3c.dom.ls.LSOutput;
public class Task18_HomeTest {
public static void main(String[] args) {

    Task18_Home home = new Task18_Home(10_000, 1000); //obiekt reprezxentujący dom
    System.out.println(home.getStatus());
    System.out.println("Bierzemy prysznic");
    home.takeShower(); // Metoda
    System.out.println(home.getStatus());
    System.out.println("Oglądamy telewizje przez 4 godziny");
    home.watchTV(4);
    System.out.println(home.getStatus());
    System.out.println("Gotujemy wodę");
    home.boilWater();
    System.out.println(home.getStatus());
    }
}
