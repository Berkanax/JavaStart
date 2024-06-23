package org.example.Task66_Static;

import org.w3c.dom.ls.LSOutput;

public class Task66_CarTest {
    public static void main(String[] args) {

        Task66_Car car = new Task66_Car(10, true, true, false, false);
        car.start();
        System.out.println(car.status());

    }
}
