package org.example.Task72_Dziedziczenie.Task73_Zoo;

public class Task73_Zoo {
    public static void main(String[] args) {
        Task73_Cat cat1 = new Task73_Cat();
        cat1.setColor("Czarny");
        Task73_Bird bird1 = new Task73_Bird();
        bird1.setColor("Niebieski");

        System.out.println("zwierząta dają głos: ");
        System.out.println("Kot: ");
        cat1.makeSound();
        System.out.println("Ptak: ");
        bird1.makeSound();
    }
}
