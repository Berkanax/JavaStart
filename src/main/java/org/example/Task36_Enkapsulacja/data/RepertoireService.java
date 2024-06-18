package org.example.Task36_Enkapsulacja.data;

public class RepertoireService {
    String title;
    String type;
    int forYears;
    int time;

    public RepertoireService(String title, String type, int forYears, int time) {
        this.title = title;
        this.type = type;
        this.forYears = forYears;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public int getForYears() {
        return forYears;
    }

    public int getTime() {
        return time;
    }
}
