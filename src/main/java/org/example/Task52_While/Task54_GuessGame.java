package org.example.Task52_While;

import java.util.Random;
import java.util.Scanner;

public class Task54_GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        final int number = rand.nextInt(1000) +1;
        int userInput;
        System.out.println("Zgadniej liczbę w zakresie (1 do 1000)");

        while ((userInput = sc.nextInt()) != number) {
            if(userInput > number) {
                System.out.println("Podana liczba jest za duża, zgaduj dalej");
            } else {
                System.out.println("Podana liczba jest za mała, zgaduj dalej");
            }
        }
        System.out.println("Brawo zgadłeś!");
        sc.close();
    }
}
