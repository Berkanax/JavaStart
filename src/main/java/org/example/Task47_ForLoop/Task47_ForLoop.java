package org.example.Task47_ForLoop;

public class Task47_ForLoop {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
