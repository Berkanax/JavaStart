package org.example.Task45_ScannerCalculator.App;

import org.example.Task45_ScannerCalculator.Calculations.Task45_Calculations;

import java.util.Scanner;

public class Task45_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.print("Enter an integer: ");
        int number2 = sc.nextInt();
        Task45_Calculations calc = new Task45_Calculations(number, number2);

        System.out.println("Select an action:  ( + | - | * | / )");
        String action = sc.next();
        switch (action) {
            case "+" -> {
                System.out.println("Dodawanie: " + calc.additional(number, number2));
            }
            case "-" -> {
                System.out.println("Odejmowanie: " + calc.minus(number, number2));
            }
            case "*" -> {
                System.out.println("Mnożenie: " + calc.multiplication(number, number2));
            }
            case "/" -> {
                System.out.println("Dzielenie: " + calc.division(number, number2));
            }
            default -> System.out.println("Nierozpoznano symbolu: " + action);
        }
        sc.close();
        System.out.println("Task60_Calculator zakończył działanie");
    }
}
