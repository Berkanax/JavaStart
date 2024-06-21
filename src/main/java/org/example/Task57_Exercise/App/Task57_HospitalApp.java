package org.example.Task57_Exercise.App;
import org.example.Task57_Exercise.Clients.Task57_Patient;
import org.example.Task57_Exercise.Data.Task57_Hospital;

import java.util.Arrays;
import java.util.Scanner;


public class Task57_HospitalApp {
    public static void main(String[] args) {

        final String app = "Welcome to Hospital Management System v1.0";
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        Task57_Patient patient = new Task57_Patient();
        Task57_Hospital[] reserve = new Task57_Hospital[3];


        System.out.println(app);
        System.out.println("Please enter your details:");
        System.out.println("First Name: ");
        patient.setFirstName(sc.nextLine());
        System.out.println("First Name: ");
        patient.setLastName(sc.nextLine());
        System.out.println("Personal Identification Number (PESEL):  ");
        patient.setPesel(sc.nextLong());

        System.out.println("### Witaj " + patient.getFirstName() + "!");
        while (!exit) {
            System.out.println("## Start:");
            System.out.println(" .0. - Wyjdź z programu  \n .1. - Umów wizyte \n .2. - Sprawdź dostępność");

            int option = sc.nextInt();
            switch (option) {
                case 0:
                exit = true;
                    System.out.println(patient.getFirstName() + ", zostałeś prawidłowo wylogowany");
                case 1:
                    boolean exit1 = false;
                    while (!exit1){
                    System.out.println(" .1. - Wizyta na 10:00  \n .2. - Wizyta na 12:00 \n .3. - Wizyta na 14:00 " +
                            "\n .4. - Powrót do do startu");
                    int option2 = sc.nextInt();
                    switch (option2) {

                        case 1:
                            System.out.println("Wizyta umówiona na godzine: 10:00");
                            reserve[0] = new Task57_Hospital();
                            exit1 = true;
                            break;
                        case 2:
                            System.out.println("Wizyta umówiona na godzine: 12:00");
                            reserve[1] = new Task57_Hospital();
                            exit1 = true;
                            break;
                        case 3:
                            System.out.println("Wizyta umówiona na godzine: 14:00");
                            reserve[2] = new Task57_Hospital();
                            break;
                        case 4:
                            System.out.println("# # # # # # # Wracasz do startu");
                            exit1 = true;

                    }

                    }
                    break;
                case 2:
                    System.out.println("------> 10:00");
                    System.out.println(Arrays.toString(reserve[0].getTermin()));
                    System.out.println("------> 12:00");
                    System.out.println(Arrays.toString(reserve[1].getTermin()));
                    System.out.println("------> 14:00");
                    System.out.println(Arrays.toString(reserve[2].getTermin()));
            }
        }
        sc.close();
    }
}
