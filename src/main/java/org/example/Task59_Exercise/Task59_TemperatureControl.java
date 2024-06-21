package org.example.Task59_Exercise;

import java.util.Scanner;

public class Task59_TemperatureControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperatur obecną: ");
        double currentTemperature = scanner.nextInt();
        System.out.println("Podaj temperature docelową");
        int targetTemperature = scanner.nextInt();

        Task59_Thermostat thermostat = new Task59_Thermostat(currentTemperature, targetTemperature);
        while (!thermostat.targetTemperatureReached()) {
            System.out.println("Aktualna temperatura " + thermostat.getCurrentTemperature());
            thermostat.adjustTempreature();
        }
        System.out.println("Osiągnięto temperature docelową " +  thermostat.getCurrentTemperature());
    }
}

