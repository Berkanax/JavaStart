package org.example.Task08_KlasyObiekty;

public class Task10_Garden {
    public static void main(String[] args) {
        Task10_Plants p1 = new Task10_Plants();
        p1.plants = "Kaktus";
        p1.requirements = "Kaktusy wymagają niewielkiej ilości wody";
        p1.dailyWaterRequirement = 0.010;
        String infoP1 = "Roślina: " + p1.plants + "\n Opis: " + p1.requirements + "\n Dzienne zapotrzebowanie wody: "
                + p1.dailyWaterRequirement;

        Task10_Plants p2 = new Task10_Plants();
        p2.plants = "Aloes";
        p2.requirements = "Aloes potrzebuje trochę więcej wody niż kaktusy";
        p2.dailyWaterRequirement = 0.030;
        String infoP2 = "Roślina: " + p2.plants + "\n Opis: " + p2.requirements + "\n Dzienne zapotrzebowanie wody: "
                + p2.dailyWaterRequirement;

        Task10_Plants p3 = new Task10_Plants();
        p3.plants = "Paprotka";
        p3.requirements = "Paprotki lubią wilgotne środowisko, więc ich zapotrzebowanie na wodę jest wyższe";
        p3.dailyWaterRequirement = 0.100;
        String infoP3 = "Roślina: " + p3.plants + "\n Opis: " + p3.requirements + "\n Dzienne zapotrzebowanie wody: "
                + p3.dailyWaterRequirement;

        double waterDay = p1.dailyWaterRequirement + p2.dailyWaterRequirement + p3.dailyWaterRequirement;
        double waterWeek = 7 * waterDay;
        double waterYear = 365 * waterDay;

        System.out.println("#### Podsumowanie zużycia wody ####");
        System.out.println("#$# Dostępne rośliny:\n" + infoP1 + "\n" + infoP3 + "\n" + infoP2 + "\n");
        System.out.println("#$# Całkowite zużycie wody");
        System.out.println("Dzienne: " + waterDay + "l");
        System.out.println("Tygodniowe: " + waterWeek + "l");
        System.out.println("Roczne: " + waterYear + "l");

    }
}
