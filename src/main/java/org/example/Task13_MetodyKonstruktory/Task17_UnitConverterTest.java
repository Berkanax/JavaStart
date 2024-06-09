package org.example.Task13_MetodyKonstruktory;

public class Task17_UnitConverterTest {
    public static void main(String[] args) {
        Task17_MetricConverter con1 = new Task17_MetricConverter();
        double metr = 33;
        double mToCm = con1.converterMetrToCm(metr);
        double mToMm = con1.converterMetrToMilimetr(metr);
        double cmToM = con1.converterCmToMetr(mToCm);
        double mmToM = con1.converterMilimetrToMetry(mToMm);

        System.out.println("\t >>> Przyjęte metry do conwertowania: " + metr + "m");
        System.out.println(metr + "m w przeliczeniu na cm to: " + mToCm + "cm");
        System.out.println(metr + "m w przeliczeniu na mm to: " + mToMm + "mm");
        System.out.println(mToCm + "cm w przeliczeniu na m to: " + cmToM + "m");
        System.out.println(mToMm + "mm w przeliczeniu na m to: " + mmToM + "m");

        System.out.println(" ");

        Task17_TimeConverter converter = new Task17_TimeConverter();
        long hours = 14;
        long minutes = converter.hToMin(hours);
        long seconds = converter.minToSec(minutes);
        long milliseconds = converter.secToMil(seconds);

        System.out.println("\t >>> Przyjęte godziny do obliczeń: " + hours + "h");
        System.out.println(hours + "h w przeliczeniu na minuty to: " + minutes + " minut");
        System.out.println(minutes + " minut, w przeliczeniu na sekundy to: " + seconds + " sekund");
        System.out.println(seconds + " sekund, w przeliczeniu na millisekundy to: " + milliseconds + " millisekund");
    }
}
