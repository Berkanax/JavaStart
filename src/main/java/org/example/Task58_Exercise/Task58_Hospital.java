package org.example.Task58_Exercise;
public class Task58_Hospital {

    private final int maxPatientsNumber = 10;
    private Task58_Patient[] patients = new Task58_Patient[maxPatientsNumber];
    private int regPatients = 0;

    void addPatient(Task58_Patient patient){
        if (regPatients < maxPatientsNumber){
            patients[regPatients] = patient;
            regPatients++;
        } else {
            System.out.println("Brak wolnych miejsc!");
        }
    }

    void printPatients(){
        for (int i = 0; i < regPatients; i++){
            System.out.println(patients[i].getInfo());
        }
    }
}

