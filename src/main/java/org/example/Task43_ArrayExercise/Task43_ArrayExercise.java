package org.example.Task43_ArrayExercise;

public class Task43_ArrayExercise {
    public static void main(String[] args) {
        double[][] array = new double[3][3];
        array[0][0] = 1.0;
        array[0][1] = 1.5;
        array[0][2] = 2.0;
        array[1][0] = 1.5;
        array[1][1] = 2.0;
        array[1][2] = 2.5;
        array[2][0] = 2.0;
        array[2][1] = 2.5;
        array[2][2] = 3.0;


        System.out.println(array[0][0] + "|" + array[0][1] + "|" + array[0][2]);
        System.out.println(array[1][0] + "|" + array[1][1] + "|" + array[1][2]);
        System.out.println(array[2][0] + "|" + array[2][1] + "|" + array[2][2]);

        System.out.println("Suma iloczynów przekątnych tablicy: " +
                ((array[0][0] * array[1][1] * array[2][2]) +
                        (array[0][2] * array[1][1] * array[2][0])));
        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny tablicy: " +
                ((array[1][0] + array[1][1] + array[1][2]) *
                        (array[0][1] + array[1][1] + array[2][1])));
        System.out.println("Sumę wszystkich elementów znajdujących się przy krawędzi tablicy: " +
                (array[0][0] + array[0][1] + array[0][2] + array[1][2]+
                        array[2][2] + array[2][1]+ array[2][0] + array[1][0]));

    }
}
