package org.example.Task34_RandomNumber.data;
import java.util.Random;

public class Task34_NumberCalc {

    Random roll = new Random();
    public int number = roll.nextInt(99);

    public void printInfo1() {
    String result;
    if (number == 5000){
        result = "równe 5000";
    } else if (number > 5000){
        result = "większę od 5000";
    } else {
        result = "mniejsze od 5000";
         }
         System.out.println(number + " - jest - " + result);
    }
    public void printInfo2() {
        String result;
        if (number % 2 == 0){
            result = "liczba parzysta";
        } else {
            result = "liczba nie parzysta";
        }
        System.out.println(number + " to " + result);
    }
    public void printInfo3() {
        String result;
     if (number / 1000 != 0){
         System.out.println("Cyfra spełnia kod 4 cyfr >> " + number);
     }   else if (number / 100 != 0) {
         System.out.println("Uzupełnienie kodu o zera: 0" + number);
     } else {
         System.out.println("Uzupełnienie kodu o zera: 00" + number);
     }
    }
}
