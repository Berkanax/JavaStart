package org.example.Task29_Switch;
import java.util.Scanner;

/*

NAJBARDZIEJ OPTYMALNA WERSJA

 */

public class Task32_SwitchExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar S, M, L, lub XL");
        String shortSize1 = scanner.nextLine();
        System.out.println("Wybrany rozmiar to: " + switch (shortSize1) {
            case "S" -> "mały";
            case "M" -> "średni";
            case "L" -> "Duży";
            case "XL" -> "Bardzo duży";
            default -> "Błędna odpowiedź";
        });
    }
}
