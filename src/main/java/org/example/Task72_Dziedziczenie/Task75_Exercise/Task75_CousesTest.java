package org.example.Task72_Dziedziczenie.Task75_Exercise;

public class Task75_CousesTest {
    public static void main(String[] args) {
        Task75_OnlineCourse online = new Task75_OnlineCourse();
        online.setId("JV-ONL-G001");
        online.setTitle("Java Developer");
        online.setPrice(15000);
        online.setTimeToFinish(80);
        online.setVideoLength(30);
        online.setDescription("Kurs Java Developer od podstaw");

        online.printInfo();
    }
}
