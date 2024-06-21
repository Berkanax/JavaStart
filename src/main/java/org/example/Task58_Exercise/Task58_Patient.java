package org.example.Task58_Exercise;

public class Task58_Patient {
    private String firstName;
    private String lastName;
    private String pesel;

    public Task58_Patient(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    public Task58_Patient() {
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

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
    String getInfo(){
        return "First Name: " + firstName + " Last Name: " + lastName + " Pesel: " + pesel;
    }
}
