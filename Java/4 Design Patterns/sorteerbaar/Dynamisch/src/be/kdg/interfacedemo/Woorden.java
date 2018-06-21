package be.kdg.interfacedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Vul aan waar nodig. Maak gebruik van de Sorteerder interface.
 */
public class Woorden implements Sorteerder {
    private List woorden;

    /* Maak hier de ArrayList */
    public Woorden(List woorden) {
        this.woorden = new ArrayList<Woord>();
        this.woorden = woorden;
    }

    /* Kopieer hier de tabel van Strings in de ArrayList */
    public Woorden(String[] woorden) {
        this.woorden = new ArrayList<Woord>();
        for (String s : woorden) {
            this.woorden.add(new Woord(s));
        }
    }

    /* Sorteer met de sort methode uit de Collections klasse */
    public void sort() {
        Collections.sort(this.woorden);
    }

    /* Sorteer met de sort methode uit de Collections klasse
     * Gebruik als tweede parameter een specifieke methode,
     * Zie hiervoor de klasse Collections
     */
    public void sortReversed() {
        Collections.sort(this.woorden, Collections.reverseOrder());
    }

    /* Zorg ervoor dat de gewenste afdruk op het scherm komt */
    public String toString() {
        if (woorden == null) return "";
        StringBuilder sb = new StringBuilder();
        for (Object woord : woorden) {
            sb.append(woord + " ");

        }
        return sb.toString();
    }
}
