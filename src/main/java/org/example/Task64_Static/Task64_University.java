package org.example.Task64_Static;

public class Task64_University {
    public static void main(String[] args) {
        System.out.println("Liczba studentów przed zapisami: " + Task64_Student.getStudentNumber());
        Task64_Student student1 = new Task64_Student("Jan", "Kowalski", 269558 );
        Task64_Student student2 = new Task64_Student("Marek", "Jarosz", 421578 );
        System.out.println("Liczba studentów po zapisach: " + Task64_Student.getStudentNumber());
    }
}
