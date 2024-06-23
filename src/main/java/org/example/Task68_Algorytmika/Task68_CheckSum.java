package org.example.Task68_Algorytmika;

import java.util.Scanner;

public class Task68_CheckSum {
    public static void main(String[] args) {
        int next = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        while ((next = sc.nextInt()) <= 100){
            sum += next;
        }
        int mod = sum % 2;
        if (mod == 0){
            System.out.println(sum + " parzysta");
        }else{
            System.out.println(sum + " nieparzysta");}
    }
}
