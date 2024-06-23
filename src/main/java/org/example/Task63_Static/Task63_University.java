package org.example.Task63_Static;

import java.util.Random;
import java.util.Scanner;

public class Task63_University {
    private static final int EXIT = 3;
    private static final int ADD_STUDENTS = 1;
    private static final int LIST_STUDENTS = 2;

    public static void main(String[] args) {
        Task63_DataStudents dataStudents = new Task63_DataStudents();
        Scanner sc = new Scanner(System.in);
        int option = -1;

        while (option != 0) {
            System.out.println("### Witaj na uczelni SDAcademy!");
            System.out.println("### Wybierz opcje:");
            System.out.println("." + ADD_STUDENTS + ". - Dodaj ucznia");
            System.out.println("." + LIST_STUDENTS + ". - Lista studentów");
            System.out.println("." + EXIT + ". - Wyjście z programu");

            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case ADD_STUDENTS:
                    System.out.println("Wprowadź imię Studenta: ");
                    String firstName = sc.nextLine();
                    System.out.println("Wprowadź nazwisko Studenta");
                    String lastName = sc.nextLine();
                    System.out.println("Generuje ID Studenta...");
                    Random rand = new Random();
                    int id = rand.nextInt(100000);
                    System.out.println("ID: " + id);
                    Task63_Student student = new Task63_Student(lastName, firstName, id);
                    dataStudents.addStudent(student);
                    break;
                case LIST_STUDENTS:
                    dataStudents.printStudents();
                    break;
                case EXIT:
                    System.out.println("Do zobaczenia!");
                    System.exit(0);
                default:
                    System.out.println("Błędny wybór");
            }
        }
        sc.close();
    }
}