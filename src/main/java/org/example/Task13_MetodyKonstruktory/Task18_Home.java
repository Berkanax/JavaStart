package org.example.Task13_MetodyKonstruktory;

public class Task18_Home { //Klasa
    double water; //Definiujemy 2 pola w klasie
    double fuel;

    Task18_Home (double w, double f) {//Konstruktor
        water = w;
        fuel = f;
    }
    String getStatus(){
        return "ilość wody: " + water + " litrów wody | Ropa:" + fuel + " litrów"; //Metoda która zwraca nam opis
    }

    void takeShower() {
        water -= 48;
    }

    void takeBath(){
        water -= 86;
    }

    void makeDinner(){
        water -= 4;
        fuel -= 0.1;
    }

    void boilWater(){
        water -= 0.5;
        fuel -= 0.05;
    }

    void watchTV(int hours){
        double fuelConsumption = hours * 0.06;
        fuel -= fuelConsumption;
    }
}
