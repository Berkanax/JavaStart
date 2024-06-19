package org.example.Task38_ArrayExample;

public class Task38_ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        String[] names = new String[10];

        numbers[0] = 5;
        names[0] = "Jan";

        System.out.println(numbers[0]);
        System.out.println(names[0]);

        /*
        ### DRUGI ZAPIS
         */

        int[] numbers1 = {33, 56, 76, 34, 65, 34, 23, 34, 54, 46, 76, 45, 23, 35, 45,};
        String[] names1 = {"Adrian", "Piotr", "Paweł", "Mateusz"};

        System.out.println(numbers1[0]);
        System.out.println(names1[0]);
    }
}
