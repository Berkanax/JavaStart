package org.example.Task33_SpecyfikatorySwitch.controller;

import org.example.Task33_SpecyfikatorySwitch.data.Task33_Point;

public class Task33_PointController {
    public void addX(Task33_Point point){
        int currentX = point.getX();
        point.setX(currentX + 1);
    }
    public void addY(Task33_Point point){
        int currentY = point.getY();
        point.setY(currentY + 1);
    }
    public void minusX(Task33_Point point){
        int currentX = point.getX();
        point.setX(currentX - 1);
    }
    public void minusY(Task33_Point point){
        int currentY = point.getY();
        point.setX(currentY - 1);
    }
}
