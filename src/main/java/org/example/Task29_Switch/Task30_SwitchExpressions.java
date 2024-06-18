package org.example.Task29_Switch;

import java.util.Scanner;

/*

OD JAVY 14 JEST EXPRESSION

 */


public class Task30_SwitchExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar S, M, L, lub XL");
        String shortSize1 = scanner.nextLine();

        String size1 = switch (shortSize1) {
            case "S":
                yield "mały";
            case "M":
                yield "średni";
            case "L":
                yield "Duży";
            case "XL":
                yield "Bardzo duży";
            default:
                yield "Błędna odpowiedź";
        };
        System.out.println("Wybrany rozmiar to: " + size1);
        /*

        >>>> PRZYKŁAD JESZCZE KRÓTSZY >>>>

         */
        System.out.println("Podaj rozmiar S, M, L, lub XL");
        String shortSize2 = scanner.nextLine();

        String size2 = switch (shortSize2) {
            case "S" -> "mały";
            case "M" ->"średni";
            case "L" -> "Duży";
            case "XL" -> "Bardzo duży";
            default -> "Błędna odpowiedź";
        };
        System.out.println("Wybrany rozmiar to: " + size2);
    }
}
