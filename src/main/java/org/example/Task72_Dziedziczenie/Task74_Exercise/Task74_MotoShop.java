package org.example.Task72_Dziedziczenie.Task74_Exercise;

public class Task74_MotoShop {
    public static void main(String[] args) {
        Task74_Tire tire = new Task74_Tire(17, 225, 123, "SuperTire", "ProContact", "Winter pro");

        tire.printInfo();

        Task74_ExhaustPart exhaustPart = new Task74_ExhaustPart(124, "EuropenTire", "ProMaxContact", "Winter pro", true);
        exhaustPart.printInfo();
    }
}
