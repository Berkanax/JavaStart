package org.example.Task72_Dziedziczenie.Task72_Vechicles;

public class Task72_Car extends Task72_WheeledVehicle{
    private int doors;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    void printInfo(){
        System.out.println("Stworzony samochód: \n silnik: " +  "\n koła: " );
    }
}
