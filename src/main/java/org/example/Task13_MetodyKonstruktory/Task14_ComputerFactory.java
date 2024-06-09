package org.example.Task13_MetodyKonstruktory;

public class Task14_ComputerFactory {
    Task14_Computer create(String procesor, int memory){
        Task14_Computer computer = new Task14_Computer();
        computer.procesro = procesor;
        computer.memory = memory;

        return computer;
    }
}
