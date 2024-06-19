package org.example.Task55_ForWhile;

import java.util.Scanner;

public class Task56_App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Witaj USER!");
        System.out.println("Podaj ile cyfr chcesz do siebie dodać: ");
        int numbers = sc.nextInt();
        int sum = 0;
        while (numbers > 0) {
            System.out.println("Podaj liczbę: ");
            sum = sum + sc.nextInt();
            numbers--;
        }
        System.out.println("Suma wszystkich liczb: " + sum);
        sc.close();
    }
}
