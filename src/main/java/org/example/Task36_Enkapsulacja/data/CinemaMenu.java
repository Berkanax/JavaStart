package org.example.Task36_Enkapsulacja.data;

import java.util.Scanner;

public class CinemaMenu {
    Client client = new Client();
    Repertoire repertoire = new Repertoire();


    public void printMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println("### Elektroniczna sprzedaż biletów");
        System.out.println("## Aby kontynuować zarejestruj się");
        System.out.println("# Wprowadź imię:");
        client.name = scanner.nextLine();
        System.out.println("# Wprowadź nazwisko:");
        client.lastName = scanner.nextLine();
        System.out.println("# Wprowadź wiek:");
        client.age = scanner.nextInt();
        System.out.println("## Rejestracja zakończona");

        while (!exit) {
            String name = client.name;
            String lastName = client.lastName;
            int age = client.age;

            System.out.println("## Wybierz pozycje: ");
            System.out.println("#1 - Dostępne repertuary");
            System.out.println("#2 - Korekta danych");
            System.out.println("#3 - Podgląd danych");
            System.out.println("#4 - Zakończ program");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    repertoire.printRepertoire(client.age);
                    System.out.println(">>>>> Powrót do menu");
                    break;
                case 2: {
                    System.out.println("## Rozpoczęto korektę danych");
                    System.out.println("# Wprowadź imię:");
                    client.setName(scanner.nextLine());
                    client.setName(scanner.nextLine());
                    System.out.println("# Wprowadź nazwisko:");
                    client.setLastName(scanner.nextLine());
                    System.out.println("# Wprowadź wiek:");
                    client.setAge(scanner.nextInt());
                    System.out.println(">>>>> Powrót do menu");
                    break;

                }
                case 3: {
                    System.out.println("Imię: " + name + " | Nazwisko: " + lastName + " | Wiek: " + age);
                    System.out.println(">>>>> Powrót do menu");
                    break;
                }
                case 4: {
                    exit = true;
                    System.out.println("Nastąpiło poprawne wylogowanie");
                }

            }
        }
    }
}

