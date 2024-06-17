package org.example.Task23_Specyfikatory.logic;
import org.example.Task23_Specyfikatory.data.Task23_Car;

class Task23_CarShop {
    public static void main(String[] args) {
        Task23_Car car1 = new Task23_Car(2017, "Audi", "A5", "Czarny");
        Task23_Car car2 = new Task23_Car(2017, "Audi", "A5");
        System.out.println(car1.getBrand() + " " + car1.getColor() + " " + car1.getModel());
        car2.setColor("czerwony");
        car2.setYear(2025);
        System.out.println(car2.getBrand() + " " + car2.getColor() + " " + car2.getYear());
    }
}
