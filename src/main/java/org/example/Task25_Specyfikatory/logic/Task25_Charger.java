package org.example.Task25_Specyfikatory.logic;

import org.example.Task25_Specyfikatory.model.Task25_Telephone;

public class Task25_Charger {
    public void charge(Task25_Telephone telephone) {
        int loading = telephone.getChargeLevel();
        telephone.setChargeLevel(loading + 1);
    }
}
