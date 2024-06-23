package org.example.Task65_Static;

public class Task65_KitchenUtils {
    static final double GLSS_TO_ML = 250;
    static final double SPOON_TO_ML = 15;
    static final double TEASPOON_TO_ML = 5;

    static double glassesToMl(double glasses){
        return glasses * GLSS_TO_ML;
    }
    static double spoonToMl(double spoons){
        return spoons * SPOON_TO_ML;
    }
    static double teaspoonToMl(double teaspoon){
        return teaspoon * TEASPOON_TO_ML;
    }
}
