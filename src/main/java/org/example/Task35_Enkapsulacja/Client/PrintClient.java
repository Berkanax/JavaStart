package org.example.Task35_Enkapsulacja.Client;

public class PrintClient {
 public void printSummary(Client client, double orginalPrice, double discountPrice){
     printWelcomeMessage(client);
     printPrices(orginalPrice, discountPrice);
 }

    private static void printPrices(double orginalPrice, double discountPrice) {
        System.out.println("Kwota przed rabatem " + orginalPrice);
        System.out.println("Do zapłaty (po rabacie) " + discountPrice);
    }

    private static void printWelcomeMessage(Client client) {
        if (client.getFirstName() != null && client.getLastName() == null) {
            System.out.println("\n Cześć! " + client.getFirstName());
        } else if(client.getFirstName() != null && client.getLastName() != null) {
            System.out.println("\n Siemasz " + client.getFirstName() + " " + client.getLastName());
        } else if(client.getFirstName() == null && client.getLastName() != null) {
            System.out.println("\n Dzień dobry Panie/Pani " + client.getLastName());
        } else {
            System.out.println("\n Witaj nieznajomy");
        }
    }
}
