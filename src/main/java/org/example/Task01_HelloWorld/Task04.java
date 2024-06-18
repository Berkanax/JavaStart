package org.example.Task01_HelloWorld;

public class Task04 {
    public static void main(String[] args) {
        Task04_01 person1 = new Task04_01("Micky", "Mouse", 27, 170.50,96112507897L);

        System.out.println(person1.firstname + " " + person1.lastname + " ma " + person1.age + " lat.");
        System.out.println("Obywatel " + person1.firstname + " " + person1.lastname + " ma pesel: " + person1.PESEL);
        System.out.println(person1.firstname + " ma wzorstu: " + person1.height + " cm");
        System.out.println("Jeżeli " + person1.firstname + " urosnie o 5 cm, to będzie miał " + (person1.height + 5) + " cm");

        person1.firstname = "Pluto";
        // person1.PESEL = 96112507848L;
        System.out.println("Imie po zamianie: " + person1.firstname);
    }
}