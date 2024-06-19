package org.example.Task45_ScannerCalculator.Calculations;

public class Task45_Calculations {
    double number1;
    double number2;

    public Task45_Calculations(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

   public double additional(double number1, double number2) {
   return number1 + number2;
    }
    public double minus(double number1, double number2) {
        return number1 - number2;
    }
    public double multiplication(double number1, double number2) {
        return number1 * number2;
    }
    public double division(double number1, double number2) {
        return number1 / number2;
    }
}
