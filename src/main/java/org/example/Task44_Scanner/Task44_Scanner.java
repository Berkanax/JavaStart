package org.example.Task44_Scanner;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Task44_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.GERMAN);
        //Możemy podawać cyfry po przecinku, jeśli zmienimy np. na USA to liczbę zamiast po przecinku to po kropkce należy wprowadzić.

        System.out.println("Wprowadź A: ");
        double a = scanner.nextDouble();
        System.out.println("Wprowadź B: ");
        double b = scanner.nextDouble();

        System.out.println("A + B = " + (a + b));
    }
}
