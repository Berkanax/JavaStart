package org.example.Task13_MetodyKonstruktory;

import org.w3c.dom.ls.LSOutput;

public class Task13_AppResult {
    public static void main(String[] args) {

    int a = 5;
    int b = 10;
    int c = a + b;
    int d = c * a;
    int e = c - a;

    Task13_Calc calc = new Task13_Calc();
    int result1 = calc.addTwoNumbers(a,c);
    int result2 = calc.addTwoNumbers(c,b);
    int result3 = calc.addTwoNumbers(a,b);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(calc.addTwoNumbers(c,c));

        System.out.println("\n Metoda oblicz i wyświetl:");
        Task13_Calc calc1 = new Task13_Calc();
        calc1.addAndPrint(d, e);

    }
}
