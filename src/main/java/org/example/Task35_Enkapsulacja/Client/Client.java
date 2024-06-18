package org.example.Task35_Enkapsulacja.Client;

public class Client {
    private String lastName;
    private String firstName;
    private boolean premium;

    public Client(String lastName, String firstName, boolean premium) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
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
}
