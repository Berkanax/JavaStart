package org.example.Task01_HelloWorld;
/*
Kalkulator Brutto/Netto
 */
public class Task07 {
    public static void main(String[] args) {
        String p1 = "Laptop";
        String p2 = "iPhone 16pro";
        String p3 = "PS5 pro";
        double priceNettoP1 = 5500;
        double priceNettoP2 = 8900;
        double priceNettoP3 = 4999;
        double priceBruttoP1 = (priceNettoP1 * 0.23) + priceNettoP1;
        double priceBruttoP2 = (priceNettoP2 * 0.23) + priceNettoP2;
        double priceBruttoP3 = (priceNettoP3 * 0.23) + priceNettoP3;

        System.out.println("Produkt: " + p1 + ", Kwota Netto: " + priceNettoP1 + ", Kwota Brutto: " + priceBruttoP1);
        System.out.println("Produkt: " + p2 + ", Kwota Netto: " + priceNettoP2 + ", Kwota Brutto: " + priceBruttoP2);
        System.out.println("Produkt: " + p3 + ", Kwota Netto: " + priceNettoP3 + ", Kwota Brutto: " + priceBruttoP3);

    }
}
