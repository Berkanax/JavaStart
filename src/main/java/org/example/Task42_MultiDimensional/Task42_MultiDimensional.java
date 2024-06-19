package org.example.Task42_MultiDimensional;

public class Task42_MultiDimensional {
    public static void main(String[] args) {
        int[][] tab = new int[3][3];
        tab[0][0] = 5;
        tab[1][1] = 5;
        tab[2][2] = 5;

        int[][] tab2 = new int[3][];
        tab2[0] = new int[3];
        tab2[1] = new int[2];
        tab2[2] = new int[1];

        String[] firstName = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",};
        String[] lastName = {"Ken", "Aug", "Sep", "Oct", "Dec"};
        String[][] firstLast ={firstName, lastName};
        System.out.println("Wymiar pierwszy: ");
        System.out.println(firstName[0] + " " + lastName[0]);

        System.out.println(" ");
        System.out.println("Wymiar drugi");
        System.out.println(firstLast[0][0] + " " + firstLast[1][0]);
    }
}
