package org.example.Task29_Switch;
import java.util.Scanner;

/*

OD JAVY 14 JEST EXPRESSION

 */

public class Task31_SwitchExpressions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar S, M, L, lub XL");
        String shortSize1 = scanner.nextLine();

        String size1 = switch (shortSize1) {
            case "S" -> {
                System.out.println("Przepisuje rozmiar do użytkownika...");
                yield "mały";
            }
            case "M"-> {
                System.out.println("Przepisuje rozmiar do użytkownika...");
                yield "średni";
            }
            case "L"-> {
                System.out.println("Przepisuje rozmiar do użytkownika...");
                yield "duży";
            }
            case "XL"-> {
                System.out.println("Przepisuje rozmiar do użytkownika...");
                yield "bardzo duży";
            }
            default -> "Błędna odpowiedź";
        };
        System.out.println("Wybrany rozmiar to: " + size1);
    }
}
