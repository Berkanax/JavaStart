package org.example.Task58_Exercise;

import java.util.Scanner;

public class Task58_HospitalApp {
    public static void main(String[] args) {
        final int exit = 0;
        final int addPatient = 1;
        final int printPatients = 2;
        Scanner input = new Scanner(System.in);
        int option = -1;
        Task58_Hospital hospital = new Task58_Hospital();

        while (option != exit) {
            System.out.println("### Start: ");
            System.out.println(exit + " - Wyjście z programu");
            System.out.println(addPatient + " - Dodanie pacjenta");
            System.out.println(printPatients + " - Wyświetl listę pacjentów");

            System.out.println("Wybierz opcje: ");
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case exit:
                    break;
                case addPatient:
                    Task58_Patient patient = new Task58_Patient();
                    System.out.println("Imię: ");
                    patient.setFirstName(input.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setLastName(input.nextLine());
                    System.out.println("Pesel: ");
                    patient.setPesel(input.nextLine());
                    break;
                case printPatients:
                    hospital.printPatients();
                    break;
                default:
                    System.out.println("Błędna odpowiedź");

            }
            input.close();
        }
    }
}
