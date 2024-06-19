package org.example.Task41_ArrayExample;

public class Task41_Elevator {
    private Task41_Person [] people = new Task41_Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;

    void add(Task41_Person person){
        if(peopleNumber <4){
            people[peopleNumber] = person;
            peopleNumber++;
        }else {
            System.out.println("Uwaga przekroczono dozwolony limit osób w windzie");
        }
    }
    private boolean weightIsCorrect(){
        return getTotalWeight() <= maxWeight;
    }

    private int getTotalWeight(){
        int totalWeight = 0;
        if(people[0] != null)
            totalWeight += people[0].getWeight();
        if(people[1] != null)
            totalWeight += people[1].getWeight();
        if(people[2] != null)
            totalWeight += people[2].getWeight();
        if(people[3] != null)
            totalWeight += people[3].getWeight();
        return totalWeight;
    }

    void start(){
    if(weightIsCorrect()){
        System.out.println("Winda wystartowała");
        } else {
        int overload = getTotalWeight() - maxWeight;
        System.out.println("Uwaga przekroczono dozwoloną wagę o " + overload + " kg");
    }
    }

    void clear(){
        people = new Task41_Person[4];
        peopleNumber = 0;
        System.out.println("#### Winda jest pusta");
    }
}
