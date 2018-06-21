package be.kdg.interfacedemo;

import java.util.Collections;
import java.util.Comparator;

/**
 * Vul aan waar nodig.
 *
 * Maak gebruik van de Sorteerbaar interface.
 */
public final class Getal implements Sorteerbaar {
    private final int getal;

    public Getal(int getal) {
        this.getal = getal;
    }

    /* Deze methode geeft true terug als het eerste getal
     *  kleiner is dan het tweede.
     */
    public boolean kleinerdan(Sorteerbaar sorteerbaar) {
        int getal2 = Integer.parseInt(sorteerbaar.toString());
        return getal - getal2 < 0;
    }

     /* Deze methode doet net het omgekeerde */
    public boolean groterDan(Sorteerbaar sorteerbaar) {
        return !kleinerdan(sorteerbaar);
    }

    /* Hier zet je een getalwaarde om naar een String, reeds uigewerkt. */
    public String toString() {
        return Integer.toString(getal);
    }
}
