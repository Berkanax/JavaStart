package org.example.Task24_Specyfikatory.controller;

import org.example.Task24_Specyfikatory.data.Task24_Point;

public class Task24_PointController {
    public void addX(Task24_Point point){
        int currentX = point.getX();
        point.setX(currentX + 1);
    }
    public void minusX(Task24_Point point){
        int currentX = point.getX();
        point.setX(currentX - 1);
    }
    public void addY(Task24_Point point){
        int currentX = point.getY();
        point.setY(currentX + 1);
    }
    public void minusY(Task24_Point point){
        int currentX = point.getY();
        point.setY(currentX - 1);
    }
}
