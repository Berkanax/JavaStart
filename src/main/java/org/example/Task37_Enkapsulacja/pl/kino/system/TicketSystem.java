package org.example.Task37_Enkapsulacja.pl.kino.system;
import org.example.Task37_Enkapsulacja.pl.kino.model.Client;
import org.example.Task37_Enkapsulacja.pl.kino.model.MovieShow;
import org.example.Task37_Enkapsulacja.pl.kino.model.Ticket;

public class TicketSystem {
    Ticket createTicket(MovieShow movieShow, Client client){
        if (movieShow.hasFreeSeats()) {
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (client.getAge() < movieShow.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movieShow.getAgeRequired() + " lat");
            return null;
        } else {
            int ticketId = movieShow.getMaxSeats() - movieShow.getFreeSeats() + 1;
            movieShow.decreaseFreeSeats();
            return new Ticket(ticketId, movieShow, client);
        }
    }
}
