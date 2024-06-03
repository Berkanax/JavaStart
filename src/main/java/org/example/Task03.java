package org.example;
/*
Napisz program, który wyświetli o tobie kilka informacji w postaci takiej jak przedstawiono poniżej.
Cześć Jan, słyszałem, że masz 25 lat i uczysz się programowania. Czy to prawda?
true
Czy Twoje inicjały to J K?
Tak, true
 */
public class Task03 {
    public static void main(String[] args) {
        System.out.print("Cześć Jan, słyszałem, że masz ");
        System.out.print(25);
        System.out.println(" lat i uczysz się programowania. Czy to prawda?");
        System.out.println(true);
        System.out.print("Czy Twoje inicjały to ");
        System.out.print('\u004A' + " ");
        System.out.println('\u004B');
        System.out.println("Tak, " + true);
    }
}
/*
[!] W zadaniu wykorzystaj nie tylko napisy zapisane w cudzysłowie, ale również podane typy danych:
liczby (int),
znaki (char),
typ logiczny (boolean).
 */