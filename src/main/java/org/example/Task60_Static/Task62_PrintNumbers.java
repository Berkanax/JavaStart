package org.example.Task60_Static;

import java.util.Scanner;

public class Task62_PrintNumbers {
    private static final int EXIT = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbę");
            int start = input.nextInt();
            System.out.println("Druga liczba");
            int end = input.nextInt();
            printNumber(start, end);
            System.out.println("Koniec programu? Wprowadź .0.");
            System.out.println("Nowy zakres? Wprowadź ." + EXIT + ".");
        } while (input.nextInt() != EXIT );
        input.close();
    }

    private static void printNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
