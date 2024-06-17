package org.example.Task26_InstrukcjeSterujące;

public class Task26_IfTest {
    public static void main(String[] args) {
        int a = 40;
        int b = 10;
        int c = 50;

        if (a > b){
            if(a > c) {
                System.out.println("A jest większe od B i C");
            } else {
                System.out.println("A jest większe od B ale mniejsze bądź równe C");
            }
        }else {
            System.out.println("A jest mniejsze od B");
        }

        boolean aPositive = a > 0; // Czy liczba jest dodatnie?
        boolean aEven = a % 2 == 0; // Czy liczba jest parzysta?

        if(aPositive && aEven){
            System.out.println("A jest liczbą parzystą i dodatnią");
        }
    }
}
