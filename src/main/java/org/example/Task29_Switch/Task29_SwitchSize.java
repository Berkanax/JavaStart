package org.example.Task29_Switch;

import java.util.Scanner;

public class Task29_SwitchSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar S, M, L, lub XL");
        String shortSize = scanner.nextLine();
        String size;
        switch (shortSize) {
            case "S":
                size = "mały";
                break;
                case "M":
                    size = "średni";
                    break;
                            case "L":
                                size = "Duży";
                                break;
                                case "XL":
                                    size = "Bardzo duży";
                                    break;
            default:
                size = "Błędna odpowiedź";
        }
        System.out.println(size);
    }
}
