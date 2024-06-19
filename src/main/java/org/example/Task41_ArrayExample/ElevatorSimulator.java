package org.example.Task41_ArrayExample;

public class ElevatorSimulator {
    public static void main(String[] args) {
        Task41_Person person1 = new Task41_Person(1, 60);
        Task41_Person person2 = new Task41_Person(2, 180);
        Task41_Person person3 = new Task41_Person(3, 150);
        Task41_Person person4 = new Task41_Person(4, 120);
        Task41_Person person5 = new Task41_Person(5, 70);

        Task41_Elevator elevator = new Task41_Elevator();
        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);

        elevator.start();
        elevator.clear();

        elevator.add(person1);
        elevator.add(person2);
        elevator.add(person3);


        elevator.start();

    }
}
