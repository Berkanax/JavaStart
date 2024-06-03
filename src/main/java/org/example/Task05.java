package org.example;
/*
Napisz program, w którym zadeklarujesz zmienne, które będą reprezentować samochód w salonie samochodowym poprzez:

Markę
Model
Rocznik
Cenę
Możesz również dodać dowolne zmienne, które samodzielnie uznasz za stosowne. Do reprezentacji każdego z powyższych elementów wykorzystaj najbardziej odpowiedni Twoim zdaniem typ danych.

Na końcu wyświetl informacje o samochodzie, które przypisałeś do zmiennych.
 */
public class Task05 {
    public static void main(String[] args) {
        System.out.println("Witaj w salonie JavaStart!");
        Task05_01 car1 = new Task05_01("Seat", "Arona", 2021, 117_000);
        Task05_01 car2 = new Task05_01("Toyota", "Corolla", 2020, 99_000);
        Task05_01 car3 = new Task05_01("Ford", "Mustang", 2019, 180_000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

    }
}
