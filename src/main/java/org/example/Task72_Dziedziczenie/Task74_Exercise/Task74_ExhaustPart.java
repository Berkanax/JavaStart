package org.example.Task72_Dziedziczenie.Task74_Exercise;

public class Task74_ExhaustPart extends Task74_Part{
    private boolean europeanStandard;

    public Task74_ExhaustPart(int seriaNumber, String producent, String model, String series, boolean europeanStandard) {
        setSeriaNumber(seriaNumber);
        setProducent(producent);
        setModel(model);
        setSeries(series);
        this.europeanStandard = europeanStandard;
    }

    public boolean isEuropeanStandard() {
        return europeanStandard;
    }

    public void setEuropeanStandard(boolean europeanStandard) {
        this.europeanStandard = europeanStandard;
    }

    void printInfo(){
        System.out.println(getSeriaNumber() + ", " + getProducent() + ", " + getModel() + ", " + getSeries() + "," + europeanStandard);
    }
}
