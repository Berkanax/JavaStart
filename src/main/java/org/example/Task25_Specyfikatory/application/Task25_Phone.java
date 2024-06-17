package org.example.Task25_Specyfikatory.application;
import org.example.Task25_Specyfikatory.logic.Task25_Charger;
import org.example.Task25_Specyfikatory.model.Task25_Telephone;

public class Task25_Phone {
    public static void main(String[] args) {
        Task25_Telephone telephone1 = new Task25_Telephone("Samsung", "Galaxy S10", 3400, 75);
        Task25_Charger charge = new Task25_Charger();
        System.out.println(telephone1.getBrand()
                + " " + telephone1.getModel()
                + ", bateria: " + telephone1.getBatteryCapacity() +"mAh"
                + ", poziom naładowania: " + telephone1.getChargeLevel() + "%");
        charge.charge(telephone1);
        charge.charge(telephone1);
        charge.charge(telephone1);
        charge.charge(telephone1);
        charge.charge(telephone1);
        System.out.println(telephone1.getBrand()
                + " " + telephone1.getModel()
                + ", bateria: " + telephone1.getBatteryCapacity() +"mAh"
                + ", poziom naładowania: " + telephone1.getChargeLevel() + "%");

    }
}
