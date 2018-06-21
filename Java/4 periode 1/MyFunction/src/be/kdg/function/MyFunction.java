package be.kdg.function;

import java.util.List;
import java.util.function.Function;

public class MyFunction {
    public int somNummers(List<Piloot> piloten, Function<Piloot, Integer> som) {
        int totaal = 0;
        // Doorloop hier de lijst van piloten met behulp van een for-each lus.
        // Pas de apply methode toe op de som-functie
        // (zie slides in verband met Function)
        for (Piloot piloot : piloten) {
            totaal += som.apply(piloot);
        }

        return totaal;
    }
}
