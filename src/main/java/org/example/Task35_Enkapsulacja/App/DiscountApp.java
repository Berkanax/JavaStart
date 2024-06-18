package org.example.Task35_Enkapsulacja.App;

import org.example.Task35_Enkapsulacja.Client.Client;
import org.example.Task35_Enkapsulacja.Client.PrintClient;
import org.example.Task35_Enkapsulacja.Service.DiscountService;

public class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Loki", "Laufeyson", true);
        double price = 1100; // zł
        DiscountService discountService = new DiscountService();
        double discountPrice = discountService.calculateDiscountPrice(client1, price);

        Client client2 = new Client("Hela", "Odinsdottir", false);
        double price2 = 1300; // zł
        double discountPrice2 = discountService.calculateDiscountPrice(client2, price2);

        Client client3 = new Client("Odyn", "Borson", true);
        double price3 = 4700; // zł
        double discountPrice3 = discountService.calculateDiscountPrice(client3, price3);

        Client client4 = new Client("Hela", "Odinsdottir", true);
        double price4 = 800; // zł
        double discountPrice4 = discountService.calculateDiscountPrice(client4, price4);

        Client client5 = new Client("Heimdall ", null, false);
        double price5 = 300; // zł
        double discountPrice5 = discountService.calculateDiscountPrice(client5, price5);

        Client client6 = new Client(null, "Brunnhilda", false);
        double price6 = 9300; // zł
        double discountPrice6 = discountService.calculateDiscountPrice(client6, price6);

        Client client7 = new Client(null, null, false);
        double price7 = 6000; // zł
        double discountPrice7 = discountService.calculateDiscountPrice(client7, price7);

        PrintClient printClient = new PrintClient();
        printClient.printSummary(client1, price, discountPrice);
        printClient.printSummary(client2, price2, discountPrice2);
        printClient.printSummary(client3, price3, discountPrice3);
        printClient.printSummary(client4, price4, discountPrice4);
        printClient.printSummary(client5, price5, discountPrice5);
        printClient.printSummary(client6, price6, discountPrice6);
        printClient.printSummary(client7, price7, discountPrice7);
    }
}
