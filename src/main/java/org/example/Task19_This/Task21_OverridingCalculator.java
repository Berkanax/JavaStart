package org.example.Task19_This;

public class Task21_OverridingCalculator {
    double add(double a, double b){
        return a + b;
    }
    double add(double a, double b, double c){
        return a + b + c;
    }
    double subtract(double a, double b){
        return a - b;
    }
    double subtract(double a, double b, double c){
        return a - b + c;
    }
}
