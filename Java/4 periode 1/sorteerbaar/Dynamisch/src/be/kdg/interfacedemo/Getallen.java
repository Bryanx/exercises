package be.kdg.interfacedemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Vul aan waar nodig. Maak gebruik van de Sorteerder interface.
 */
public class Getallen implements Sorteerder {
    private List getallen;

    /* Maak hier de ArrayList */
    public Getallen(List getallen) {
        this.getallen = new ArrayList<Getal>();
        this.getallen = getallen;
    }

    /* Kopieer hier de tabel van int in de ArrayList
     * Maak gebruik van new Getal(...) */
    public Getallen(int[] getallen) {
        this.getallen = new ArrayList<Getal>();
        for (int i : getallen) {
            this.getallen.add(new Getal(i));
        }
    }

    /* Sorteer met de sort methode uit de Collections klasse */
    public void sort() {
        Collections.sort(this.getallen);
    }

    /* Sorteer met de sort methode uit de Collections klasse
     * Gebruik als tweede parameter een specifieke methode,
     * Zie hiervoor de klasse Collections
     */
    public void sortReversed() {
        Collections.sort(this.getallen, Collections.reverseOrder());
    }

    /* Zorg ervoor dat de gewenste afdruk op het scherm komt */
    public String toString() {
        if (getallen == null) return "";
        StringBuilder sb = new StringBuilder();
        for (Object getal : this.getallen) {
            sb.append(getal + " ");

        }
        return sb.toString();
    }
}

