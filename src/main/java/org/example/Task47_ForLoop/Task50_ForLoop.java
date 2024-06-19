package org.example.Task47_ForLoop;

import java.util.Scanner;

public class Task50_ForLoop {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);

        int tmp = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczbę do tabeli: ");
            tmp = numbers[i];
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        sc.close();
    }
}
