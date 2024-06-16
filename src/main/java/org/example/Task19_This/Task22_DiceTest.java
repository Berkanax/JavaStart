package org.example.Task19_This;

import java.util.Random;

public class Task22_DiceTest {
    public static void main(String[] args) {
        Task22_Dice dice = new Task22_Dice();
        System.out.println(dice.top);
        dice.printInfo();
        dice.roll();
        dice.printInfo();

    }
}
