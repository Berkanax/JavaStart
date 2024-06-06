package org.example.Task08_KlasyObiekty;

public class Task09_Company {
    public static void main(String[] args) {
        Task09_Employee employee1 = new Task09_Employee("Andrzej", "Mawik", 1996,
                6, 184563);
        Task09_Employee employee2 = new Task09_Employee("Cezary", "Takowski", 1990,
                12, 131511);
        Task09_Employee employee3 = new Task09_Employee("Michał", "Muszka", 1996,
                5, 189912);

        String e1 = ("Imię: " + employee1.firstName + " | Nazwisko: " + employee1.lastName + " | Rok urodzenia: "
                + employee1.yearOfBirth + " | Staż pracy: " + employee1.senioryty + " | SKP: " + employee1.idWork);

        String e2 = ("Imię: " + employee2.firstName + " | Nazwisko: " + employee2.lastName + " | Rok urodzenia: "
                + employee2.yearOfBirth + " | Staż pracy: " + employee2.senioryty + " | SKP: " + employee2.idWork);

        String e3 = ("Imię: " + employee3.firstName + " | Nazwisko: " + employee3.lastName + " | Rok urodzenia: "
                + employee3.yearOfBirth + " | Staż pracy: " + employee3.senioryty + " | SKP: " + employee3.idWork);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
