package be.kdg.interfacedemo;

/**
 * Vul aan waar nodig. Maak gebruik van de Sorteerder interface.
 */
public class Woorden implements Sorteerder {
    private Woord woorden[];

    /*
     * Maak hier de nieuwe tabel. Kopieer dan de tabel van strings
     * naar de nieuwe tabel van het type Woord. Maak gebruik van new Woord(...)
     * om de strings naar type Woord om te zetten.
     */
    public Woorden(String[] woorden) {
        this.woorden = new Woord[woorden.length];
        for (int i = 0; i < woorden.length; i++) {
            this.woorden[i] = new Woord(woorden[i]);
        }
    }

    /* Sorteer met de sort methode (zie klasse BubbleSort) */
    public void sort() {
        BubbleSort.sort(woorden);
    }

    /* Sorteer met de sortReversed methode (zie klasse BubbleSort) */
    public void sortReversed() {
        BubbleSort.sortReversed(woorden);
    }

    /* Zorg ervoor dat de gewenste afdruk op het scherm komt */
    public String toString() {
        if (woorden == null) return "";
        StringBuilder sb = new StringBuilder();
        for (Woord woord : woorden) {
            sb.append(woord + " ");

        }
        return sb.toString();
    }
}
