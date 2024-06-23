package org.example.Task63_Static;

public class Task63_Student {
    private String lastName;
    private String firstName;
    private int index;
    private int studentsInSchool;

    public Task63_Student(String lastName, String firstName, int index) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.index = index;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getStudentsInSchool() {
        return studentsInSchool;
    }

    public void setStudentsInSchool(int studentsInSchool) {
        this.studentsInSchool = studentsInSchool;
    }

    String getInfo() {
        return "ID: " + index + "\nLast Name: " + lastName + "\nFirst Name: " + firstName;
    }
}
