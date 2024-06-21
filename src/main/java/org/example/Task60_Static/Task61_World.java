package org.example.Task60_Static;

public class Task61_World {
    public static void main(String[] args) {
        Task61_Human adam = new Task61_Human("Adam", 186.5);
        Task61_Human ewa  = new Task61_Human("Ewa", 160);

        Task61_Human.avgHeiht = (adam.getHeight() + ewa.getHeight()) / 2;
        System.out.println("Pierwsi ludzie na Ziemi");
        System.out.println(adam.getName() + ", " + adam.getHeight() + "cm wzrostu");
        System.out.println(ewa.getName() + ", " + ewa.getHeight() + "cm wzrostu");

        System.out.println("Średni wzrost:");
        System.out.println(Task61_Human.avgHeiht);
    }
}
