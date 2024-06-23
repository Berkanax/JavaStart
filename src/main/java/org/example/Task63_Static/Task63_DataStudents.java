package org.example.Task63_Static;

public class Task63_DataStudents {
    private final int MAX_STUDENTS = 100;
    private Task63_Student[] students = new Task63_Student[MAX_STUDENTS];
    private int regStudents = 0;

    void addStudent(Task63_Student student) {
        if (regStudents < MAX_STUDENTS) {
            students[regStudents] = student;
            regStudents++;
        } else {
            System.out.println("# # # # # # Student is over max student number");
        }
    }

    void printStudents() {
        for (int i = 0; i < regStudents; i++) {
            System.out.println(students[i].getInfo());
        }
    }
}