package org.example.Task24_Specyfikatory.app;

import org.example.Task24_Specyfikatory.controller.Task24_PointController;
import org.example.Task24_Specyfikatory.data.Task24_Point;

public class Task24_PointApplication {
    public static void main(String[] args) {
        Task24_Point point1 = new Task24_Point(10, 20);
        Task24_PointController pc = new Task24_PointController();

        System.out.println("Punkt X: (" + point1.getX() + "), Punkt Y: (" + point1.getY() + ")");
        pc.addX(point1);
        System.out.println("Punkt addX: (" + point1.getX() + "), Punkt Y: (" + point1.getY() + ")");
        pc.addY(point1);
        System.out.println("Punkt X: (" + point1.getX() + "), Punkt addY: (" + point1.getY() + ")");
        pc.minusX(point1);
        System.out.println("Punkt minusX: (" + point1.getX() + "), Punkt Y: (" + point1.getY() + ")");
        pc.minusY(point1);
        System.out.println("Punkt X: (" + point1.getX() + "), Punkt minusY: (" + point1.getY() + ")");
    }
}
