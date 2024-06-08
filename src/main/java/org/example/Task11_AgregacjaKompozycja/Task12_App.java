package org.example.Task11_AgregacjaKompozycja;

public class Task12_App {
    public static void main(String[] args) {

        Task12_User user1 = new Task12_User();
        user1.firstName = "Jan";
        user1.lastName = "Noe";

        Task12_User user2 = new Task12_User();
        user2.firstName = "Lan";
        user2.lastName = "Ork";

        Task12_Address address1 = new Task12_Address();
        address1.street = "Pastelowa";
        address1.number = "10";
        address1.postalCode = "60-320";
        address1.city = "Poznań";
        user1.shipping = address1;

        Task12_Address address2 = new Task12_Address();
        address2.street = "Kolorowa";
        address2.number = "3";
        address2.postalCode = "60-320";
        address2.city = "Poznań";
        user2.shipping = address2;

        Task12_Auction auction1 = new Task12_Auction();
        auction1.title = "Xbox One";
        auction1.description = "Konsola dla wymagających graczy";
        auction1.price = 999.99;
        auction1.seller = user1;

        Task12_Auction auction2 = new Task12_Auction();
        auction2.title = "Apple iPhone 20 pro";
        auction2.description = "Najnowszy iPhone, jakiego świat jeszcze nie widział";
        auction2.price = 8499.00;
        auction2.seller = user2;

        System.out.println("############# Aukcja 1");
        System.out.println(auction1.title + "\n" + auction1.description + "\n" + "Cena: " + auction1.price);
        System.out.println("Sprzedający: " + user1.firstName + " " + user1.lastName + "\n");
        System.out.println("############# Aukcja 2");
        System.out.println(auction2.title + "\n" + auction2.description + "\n" + "Cena: " + auction2.price);
        System.out.println("Sprzedający: " + user2.firstName + " " + user2.lastName);

    }
}
