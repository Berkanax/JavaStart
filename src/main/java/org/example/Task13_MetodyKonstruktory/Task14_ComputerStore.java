package org.example.Task13_MetodyKonstruktory;

public class Task14_ComputerStore {
    public static void main(String[] args) {

        Task14_Computer comp1 = new Task14_Computer();
        comp1.procesro = "AMD Ryzen 1700";
        comp1.memory = 16_384;

        Task14_Computer comp2 = new Task14_Computer();
        comp2.procesro = "Intel i5";
        comp2.memory = 8192;

        Task14_Computer comp3 = new Task14_Computer();
        comp3.procesro = "Intel i7";
        comp3.memory = 32768;

        Task14_ComputerFactory factory = new Task14_ComputerFactory();
        Task14_Computer comp4 = factory.create("Intel i9", 32_768);
        Task14_Computer comp5 = factory.create("Intel i10", 32_768);

        comp1.printIfno();                          //Sposób 1
        System.out.println(comp2.getInfo());        //Sposób 2
        System.out.println("\n" + comp3.getInfo() + " //Przed dodaniem pamięci");

        Task14_CumputerUpgrade computerUpgrade = new Task14_CumputerUpgrade();
        computerUpgrade.addMemory(comp3, 1024);

        comp3.printIfno();
        comp4.printIfno();
        comp5.printIfno();


    }
}
