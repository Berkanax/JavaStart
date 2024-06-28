package org.example.Task72_Dziedziczenie.Task74_Exercise;

public class Task74_Tire extends Task74_Part{
    private int size;
    private double width;

    public Task74_Tire(int size, double width, int seriaNumber, String producent, String model, String series) {
        this.size = size;
        this.width = width;
        setSeriaNumber(seriaNumber);
        setProducent(producent);
        setModel(model);
        setSeries(series);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    void printInfo(){
        System.out.println(getSeriaNumber() + ", " + getProducent() + ", " + getModel() + ", " + getSeries() + "," + size + ", " + width);
    }
}
