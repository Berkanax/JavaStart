package org.example.Task59_Exercise;

public class Task59_Thermostat {
    private double currentTemperature;
    private double targetTemperature;

    public Task59_Thermostat(double currentTemperature, double targetTemperature) {
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }

    boolean targetTemperatureReached() {
        return currentTemperature == targetTemperature;
    }

    void adjustTempreature() {
        double temperaturaDiff = targetTemperature - currentTemperature;
        if (temperaturaDiff > 0) {
            currentTemperature += 0.5;
        } else if (temperaturaDiff < 0) {
            currentTemperature -= 0.5;
        }
    }
}
