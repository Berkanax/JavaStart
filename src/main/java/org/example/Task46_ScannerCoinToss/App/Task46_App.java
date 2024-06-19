package org.example.Task46_ScannerCoinToss.App;

import java.util.Random;
import java.util.Scanner;

public class Task46_App {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Witaj user!");
        System.out.println("Zanim rzucę monetą wybierz jedną stronę: ");
        System.out.println(" # 1 - Orzeł ----- \n # 2 - Reszka ----");

        int userChoice = sc.nextInt();

        Random rand = new Random();
        int coinThrow = rand.nextInt(2) +1;

        System.out.println(coinThrow);

        if (userChoice == coinThrow) {
            System.out.println("Gratulacje wygrałeś");
        } else {
            System.out.println("Przegrałeś");
        }

    }
}



