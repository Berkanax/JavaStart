package org.example.Task11_AgregacjaKompozycja;

public class Task11_Bank {
    public static void main(String[] args) {
        Task11_Person person1 = new Task11_Person();
        person1.firstName = "Michał";
        person1.lastName = "Muszka";
        person1.pesel = "123456789";

        Task11_BankAccount account1 = new Task11_BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        Task11_Credit credit1 = new Task11_Credit();
        credit1.borrower =person1;
        credit1.cashBorrowed = 5000;
        credit1.cashReturned = 0;
        credit1.interestRate = 0.10;

        System.out.println("Osoba 1");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("Posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);
    }
}
