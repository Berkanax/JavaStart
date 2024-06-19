package org.example.Task40_ArrayExample;

import java.util.Random;
import java.util.Scanner;

public class Task40_TestApp {
    public static void main(String[] args) {
        Random ramdom = new Random();
        int rand1 = ramdom.nextInt(10);
        int rand2 = ramdom.nextInt(100);
        int rand3 = ramdom.nextInt(1000);
        Task40_ArrayBase[] randomNumbers = new Task40_ArrayBase[3];
        randomNumbers[0] = new Task40_ArrayBase(rand1, rand2, rand3);
        randomNumbers[1] = new Task40_ArrayBase(rand1, rand2, rand3);
        randomNumbers[2] = new Task40_ArrayBase(rand1, rand2, rand3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz zestaw liczb z zakresu od 1 do 3");
        if (scanner.hasNextInt()) {
            int userNumber = scanner.nextInt();
            if (userNumber >= 0 && userNumber < randomNumbers.length + 1) {
                System.out.println(" Zakres do 10: " + randomNumbers[userNumber - 1].getNum1() + " \n Zakres do 100: "
                        + randomNumbers[userNumber - 1].getNum2() + " \n Zakres do 1000: "
                        + randomNumbers[userNumber - 1].getNum3());
            } else {
                System.out.println("Błędny wybór!");
            }

        }
    }

}

