package org.example.Task55_ForWhile;

import java.util.Scanner;

public class Task55_App1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Witaj USER!");
        System.out.println("Podaj ile cyfr chcesz do siebie dodać: ");
        int numbers = sc.nextInt();
        int sum = 0;
        for ( ; numbers > 0 ; numbers--) {
            System.out.println("Podaj kolejną liczbę");
            sum = sum + sc.nextInt();
        }
        System.out.println("Wynik: " + sum);
        System.out.println("# # # # # # # # # # # # #");
        sc.close();
    }
}
