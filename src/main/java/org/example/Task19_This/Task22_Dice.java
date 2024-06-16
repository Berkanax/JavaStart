package org.example.Task19_This;

import java.util.Random;

public class Task22_Dice {
    int top;
    Task22_Dice() {
        roll();

    }
    Task22_Dice(int top){
        this.top = top;
    }
    void roll(){
        Random random = new Random();
        top = random.nextInt(6) + 1;
    }

    void printInfo(){
        System.out.println("Liczba oczek na kostce: " + top);
    }
}
