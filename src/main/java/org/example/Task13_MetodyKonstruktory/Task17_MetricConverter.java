package org.example.Task13_MetodyKonstruktory;
//1 metr to 100 centymetrów i 1000 milimetrów.
public class Task17_MetricConverter {
    long numberConverte;

    double converterMetrToCm(double mToCm){
        return mToCm * 100;
    }
    double converterMetrToMilimetr(double mToMm){
        return mToMm * 1000;
    }
    double converterCmToMetr(double cmToM){
        return cmToM * 0.01;
    }
    double converterMilimetrToMetry(double mmToM){
        return mmToM * 0.001 ;
    }
}
