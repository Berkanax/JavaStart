package org.example.Task19_This;

public class Task21_OverridingTest {
    public static void main(String[] args) {
        Task21_OverridingCalculator calc1 = new Task21_OverridingCalculator();
        double a = 20;
        double b = 50;
        double c = 90;
        System.out.println(calc1.add(a,b));
        System.out.println(calc1.add(573,333,220));
        System.out.println(calc1.subtract(50,c));
        System.out.println(calc1.subtract(73,27, 1));
    }
}
