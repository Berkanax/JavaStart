package org.example.Task11_AgregacjaKompozycja;

public class Task11_Bank {
    public static void main(String[] args) {
        Task11_Person person1 = new Task11_Person();
        person1.firstName = "Michał";
        person1.lastName = "Muszka";
        person1.pesel = "123456789";
        person1.cif = 1003675;

        Task11_Adress adress1 = new Task11_Adress();
        adress1.street = "Bułgarska";
        adress1.number = "59W/897";
        adress1.postal = "60-320";
        adress1.city = "Poznań";
        person1.registeredAddress = adress1;
        person1.livingAddress = adress1;

        Task11_BankAccount account1 = new Task11_BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        Task11_Credit credit1 = new Task11_Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 5000;
        credit1.cashReturned = 0;
        credit1.interestRate = 0.10;

        Task11_Person person2 = new Task11_Person();
        person2.firstName = "Mateusz";
        person2.lastName = "Banasik";
        person2.pesel = "987654321";
        person2.cif = 1003658;
        person2.registeredAddress = new Task11_Adress();
        person2.registeredAddress.street = "Gejowska";
        person2.registeredAddress.number = "69/96";
        person2.registeredAddress.postal = "69-666";
        person2.registeredAddress.city = "Tęczowo";
        person2.livingAddress = adress1;

        Task11_BankAccount account2 = new Task11_BankAccount();
        account2.owner = person2;
        account2.balance = (-1_500);

        Task11_Credit credit2 = new Task11_Credit();
        credit2.borrower = person2;
        credit2.cashBorrowed = 1000;
        credit2.cashReturned = 0;
        credit2.interestRate = 5.50;

        System.out.println("Klient CIF: " + person1.cif);
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("Zameldowana:\n " + adress1.street + " " + adress1.number + "\n "
                + adress1.postal + ", " + adress1.city);
        System.out.println("Posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);

        System.out.println("\n \n ###### Następny Klient:\n \n");

        System.out.println("Klient CIF: " + person2.cif);
        System.out.println(person2.firstName + " " + person2.lastName + " " + person2.pesel);
        System.out.println("Zameldowana:\n " + person2.registeredAddress.street + " " + person2.registeredAddress.number + "\n "
                + person2.registeredAddress.postal + ", " + person2.registeredAddress.city);
        System.out.println("Korespondencja:\n " + person2.livingAddress.street + " " + person2.livingAddress.number + "\n "
                + person2.livingAddress.postal + ", " + person2.livingAddress.city);
        System.out.println("Posiada konto bankowe z kwotą: " + account2.balance);
        System.out.println("oraz kredyt na kwotę: " + credit2.cashBorrowed);
    }
}
