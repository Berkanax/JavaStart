package org.example.Task26_InstrukcjeSterujące;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task27_UserTest {
    public static void main(String[] args) {
        Task27_User user = new Task27_User("Jan", "Kowalski");
        System.out.println("Wybierz opcje");
        System.out.println("0 - Wyjście z programu");
        System.out.println("1 - Wyświetl informacje o użytkowniku");
        System.out.println("2 - Modyfikacja danych");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if (option == 0) {
            System.out.println("Bey Bey");
        } else if (option == 1) {
            System.out.println("Użytkownik: " + user.getFirstName() + " " + user.getLastName());
        } else if (option == 2) {
            user.setFirstName("Marian");
            user.setLastName("Powolny");
            System.out.println("Zmodyfikowane dane uzytkownika na: " + user.getFirstName() + " " + user.getLastName());
        } else {
            System.out.println("Błędna opcja");
        }
    }
}
