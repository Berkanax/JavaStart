package org.example.Task60_Static;

import java.util.Scanner;

public class Task62_PrintNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbę");
            int start = input.nextInt();
            System.out.println("Druga liczba");
            int end = input.nextInt();
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("Koniec programu? Wprowadź .0.");
            System.out.println("Nowy zakres? Wprowadź .1.");
        } while (input.nextInt() != 0 );
        input.close();
    }
}
