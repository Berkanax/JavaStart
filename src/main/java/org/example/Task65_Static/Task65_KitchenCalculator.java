package org.example.Task65_Static;

public class Task65_KitchenCalculator {
    public static void main(String[] args) {
        double waterGlasses = 2;
        double oilSpoons = 2.5;
        double honeyTeaspoons = 4;

        double waterMl = Task65_KitchenUtils.glassesToMl(waterGlasses);
        double oilMl = Task65_KitchenUtils.spoonToMl(oilSpoons);
        double honeyMl = Task65_KitchenUtils.teaspoonToMl(honeyTeaspoons);

        System.out.println("Do przepisu potrzebujesz: ");
        System.out.println(waterGlasses + " Przeliczenie szklanek wody na ml " + waterMl);
        System.out.println(oilSpoons + " Przeliczenie łyżek na ml " + oilMl);
        System.out.println(honeyTeaspoons + " Przeliczenie łyżeczek na ml " + honeyMl);
    }
}
