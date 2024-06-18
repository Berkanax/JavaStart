package org.example.Task37_Enkapsulacja.pl.kino.system;

import org.example.Task37_Enkapsulacja.pl.kino.model.Client;
import org.example.Task37_Enkapsulacja.pl.kino.model.MovieShow;
import org.example.Task37_Enkapsulacja.pl.kino.model.Ticket;

public class Task37_CinemaSystem {
    public static void main(String[] args) {
        MovieShow movie1 = new MovieShow("Omen", "horror", 128, 16, 72, 72);
        Client client1 = new Client("Jan", "Kowalski", 25);
        Client client2 = new Client("Anna", "Zalewska", 19);

        TicketSystem ticketSystem = new TicketSystem();
        Ticket ticket1 = ticketSystem.createTicket(movie1, client1);
        Ticket ticket2 = ticketSystem.createTicket(movie1, client2);


        System.out.println("Sprzedane bilety");
        if (ticket1 != null) {
            System.out.println(ticket1.getInfo());
        }
        if (ticket2 != null) {
            System.out.println(ticket2.getInfo());
             }

        System.out.println("Liczba pozostałych miejsc: " + movie1.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (movie1.getMaxSeats() - movie1.getFreeSeats()));
    }
}
