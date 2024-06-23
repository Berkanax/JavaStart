package org.example.Task69_Algorytmika;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task69_Algorytmika {
    public static void main(String[] args) {

        int index = 0;
        int multi = 1;
        int next = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź wartość: ");


        while(index < 5){
            next = sc.nextInt();
            multi *= next;
            index++;
        }
        if (multi >= 0){
            System.out.println("Nieujemna");
        } else {
            System.out.println("Ujemna");
        }
    }

}
