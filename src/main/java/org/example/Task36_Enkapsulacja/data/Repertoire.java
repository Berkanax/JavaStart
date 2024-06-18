package org.example.Task36_Enkapsulacja.data;

import java.util.ArrayList;
import java.util.List;

public class Repertoire {
    Client client = new Client();

    public List<RepertoireService> repertoireList = new ArrayList<>();

    public Repertoire() {
        repertoireList.add(new RepertoireService("BAD BOYS: RIDE OR DIE", "Akcja", 18, 115));
        repertoireList.add(new RepertoireService("DIUNA: CZĘŚĆ DRUGA", "Akcja", 18, 166));
        repertoireList.add(new RepertoireService("EGZORCYZM", "Horror", 18, 93));
        repertoireList.add(new RepertoireService("FILM DLA KOSMITÓW", "Familijny", 7, 74));
        repertoireList.add(new RepertoireService("GRU I MINIONKI: POD PRZYKRYWKĄ", "Familijny", 0, 95));
        repertoireList.add(new RepertoireService("GARFIELD", "Przygodówka", 0, 101));
        repertoireList.add(new RepertoireService("ISTOTY FANTASTYCZNE", "Akcja", 7, 108));
    }

    public void printRepertoire(int clientAge) {
        for (RepertoireService repertoire : repertoireList) {
            if (clientAge >= repertoire.getForYears()) {
                System.out.println("Tytuł: " + repertoire.getTitle() + " | Gatunek: " + repertoire.getType() + " | Czas trwania: " + repertoire.getTime());
            }
        }
    }
}