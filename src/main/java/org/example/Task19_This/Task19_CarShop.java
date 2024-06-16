package org.example.Task19_This;
class Task19_CarShop {
    public static void main(String[] args) {
        Task19_Car car1 = new Task19_Car(2017, "Audi", "A5", "Czarny");
        Task19_Car car2 = new Task19_Car(2017, "Audi", "A5");
        System.out.println(car1.model + " " + car1.color);
        System.out.println(car2.model + " " + car2.color);
    }
}
