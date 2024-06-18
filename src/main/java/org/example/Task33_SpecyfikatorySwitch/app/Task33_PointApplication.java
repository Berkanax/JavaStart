package org.example.Task33_SpecyfikatorySwitch.app;
import org.example.Task33_SpecyfikatorySwitch.controller.Task33_PointController;
import org.example.Task33_SpecyfikatorySwitch.data.Task33_Point;

import java.util.Scanner;

public class Task33_PointApplication {
    public static void main(String[] args) {
        Task33_Point point1 = new Task33_Point(10, 20);
        Task33_PointController pc = new Task33_PointController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("### Ręczne ustawianie punktów X & Y");
        System.out.println("## Obecne wyniki >> Punkt X: (" + point1.getX() + "), Punkt Y: (" + point1.getY() + ")");
        System.out.println("## Wprowadź modyfikacje wyników");
        System.out.println("#0 - Dodaje .1. punkt X");
        System.out.println("#1 - Odejmuje .1. punkt X");
        System.out.println("#2 - Odejmuje .1. punkt Y");
        System.out.println("#3 - Dodaje .1. punkt Y");
        System.out.println("");
        System.out.println("Wprowadź kod: ");
        String option = scanner.nextLine();
        System.out.println(" " + switch (option) {
            case "0" -> {
                pc.addX(point1);
                yield "Dodałem .1. punkt dla X";
            }

            case "1" -> {
                pc.minusX(point1);
                yield "Odjąłem .1. punkt dla X";
            }

            case "2" -> {
                pc.minusY(point1);
                yield "Odjąłem .1. punkt dla Y";
            }

            case "3" -> {
                pc.addY(point1);
                yield "Dodałem .1. punkt dla Y";
            }

            default -> "Błędna odpowiedź";
        });
        System.out.println("Punkt X: (" + point1.getX() + "), Punkt Y: (" + point1.getY() + ")");
    }
}
