package org.example.Task26_InstrukcjeSterujące;

import java.util.Scanner;

public class Task28_HelloName {
    public static void main(String[] args) {

        final String name1 = "Paweł";
        final String name2 = "Piotr";
        final String name3 = "Cezary";
        final String name4 = "Adrian";
        //case zawsze musza mieć pewność że wartość się nie zmieni więc trzeba oznaczyć zmienne jako final
        System.out.println("Wprowadź swoje imię:");
        Scanner scanner = new Scanner(System.in);
        String opttion = scanner.nextLine();
        switch (opttion) {
            case name1:
            case name2:
            case name3:
                System.out.println("Siema " + opttion);
                break;
            case name4:
                System.out.println("Witaj prezesie " + opttion);
                break;
            default:
                System.out.println("Konto gość: " + opttion);
        }
        System.out.println("Koniec programu");
    }
}
