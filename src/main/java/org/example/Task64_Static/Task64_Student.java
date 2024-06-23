package org.example.Task64_Static;

public class Task64_Student {
    private static int studentNumber;
    private String firstName;
    private String lastName;
    private int idex;

    public Task64_Student(String firstName, String lastName, int idex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idex = idex;
        studentNumber++;
    }

    public static int getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdex() {
        return idex;
    }

    public void setIdex(int idex) {
        this.idex = idex;
    }
}
