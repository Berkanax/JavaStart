package org.example.Task13_MetodyKonstruktory;
//1 godzina to 60 minut, 1 minuta to 60 sekund, 1 sekunda to 1000 milisekund.
/*
godzin na minuty
minut na sekundy
sekund na milisekundy
 */
public class Task17_TimeConverter {
    public long hToMin(long hours) {
        return hours * 60;
    }
    public long minToSec(long minutes) {
        return minutes * 60;
    }
    public long secToMil(long seconds) {
        return seconds * 1000;
    }

}


