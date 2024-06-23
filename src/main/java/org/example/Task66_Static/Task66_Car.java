package org.example.Task66_Static;

import java.awt.desktop.AboutEvent;

public class Task66_Car {
    public static final int OK = 100;
    public static final int ERROR_CHECK_ENGINE = 200;
    public static final int ERROR_NO_FUEL = 300;
    public static final int WARNING_FUEL_FLAP_OPEN = 400;
    public static final int WARNING_DOOR_OPEN = 500;

    private int fuel;
    private boolean engineOk;
    private boolean engineOn;
    private boolean fuelFlapOpen;
    private boolean doorsOpen;

    public Task66_Car(int fuel, boolean engineOk, boolean engineOn, boolean fuelFlapOpen, boolean doordOpen) {
        this.fuel = fuel;
        this.engineOk = engineOk;
        this.engineOn = engineOn;
        this.fuelFlapOpen = fuelFlapOpen;
        this.doorsOpen = doordOpen;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        if (fuel <= 0)
            engineOn = false;
        this.fuel = fuel;
    }

    public boolean isEngineOk(boolean engineOk) {
        if (!engineOk)
            engineOn = false;
        return engineOk;
    }

    public void setEngineOk(boolean engineOk) {
        this.engineOk = engineOk;
    }

    public boolean isEngineOn(boolean engineOn) {
        int systemCheck = systemCheck();
        if (systemCheck == ERROR_CHECK_ENGINE || systemCheck == ERROR_NO_FUEL) {
            this.engineOk = false;
        } else {
            this.engineOk = engineOn;
        }
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    public boolean isFuelFlapOpen() {
        return fuelFlapOpen;
    }

    public void setFuelFlapOpen(boolean fuelFlapOpen) {
        this.fuelFlapOpen = fuelFlapOpen;
    }

    public boolean isDoordOpen() {
        return doorsOpen;
    }

    public void setDoordOpen(boolean doordOpen) {
        this.doorsOpen = doordOpen;
    }

    int start() {
        int systemCheck = systemCheck();
        setEngineOk(true);
        return systemCheck();
    }

    private int systemCheck() {
        if (!engineOk)
            return ERROR_CHECK_ENGINE;
        if (fuel <= 0)
            return ERROR_NO_FUEL;
        if (fuelFlapOpen)
            return WARNING_FUEL_FLAP_OPEN;
        if (doorsOpen)
            return WARNING_DOOR_OPEN;
        return OK;
    }

    String status() {
        if (systemCheck() == OK)
            return "Wszystkie systemy sa sprawne";
        String status = "Status samochodu: \n";
        if (!engineOk)
            status += " > Silnik uszkodzony \n";
        if (fuel <= 0)
            status += " > Brak paliwa \n";
        if (fuelFlapOpen)
            status += " > Zamknij wlew paliwa \n";
        if (doorsOpen)
            status += " > Drzwi lub bagaznik są otwarte \n";
        if (engineOn)
            status += " > Silnik włączony";
        else
            status += " > Silnik wyłączony !";

        return status;
    }
}