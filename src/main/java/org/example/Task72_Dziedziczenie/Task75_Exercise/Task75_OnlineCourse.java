package org.example.Task72_Dziedziczenie.Task75_Exercise;

public class Task75_OnlineCourse extends Task75_Course{
    private int videoLength;
    private int timeToFinish;

    public int getVideoLength() {
        return videoLength;
    }

    public void setVideoLength(int videoLength) {
        this.videoLength = videoLength;
    }

    public int getTimeToFinish() {
        return timeToFinish;
    }

    public void setTimeToFinish(int timeToFinish) {
        this.timeToFinish = timeToFinish;
    }

    void printInfo(){
        System.out.println("ID Kursu: " + getId() + ", Nazwa Kursu: " + getTitle() + ", Cena: " + getPrice()
                + ", Ilość godzin" + getTimeToFinish() +", Ilość godzin wideo: " + getVideoLength()
                + ", Opis:" + getDescription());
    }
}
