package org.example.Task08;

public class Task08_CarShop {
    public static void main(String[] args) {
        
        Task08_Car car1 = new Task08_Car();
        car1.brand = "Audi";
        car1.model = "A4";
        car1.color = "Czarny";
        car1.wheelsColor = "Srebny";
        car1.tiresColor = "Czarny";
        car1.doors = 5;

        System.out.println(car1.brand);
    }
}
