package be.kdg.interfacedemo;

/**
 * Vul aan waar nodig. Maak gebruik van de Sorteerder interface.
 */
public class Getallen implements Sorteerder {
    private Getal getallen[];

    /*
     * Maak hier de nieuwe tabel. Kopieer dan de tabel van int getallen
     * naar de nieuwe tabel van het type Getal. Maak gebruik van new Getal(...)
     * om de int waarden naar type Getal om te zetten.
     */
    public Getallen(int[] getallen) {
        this.getallen = new Getal[getallen.length];
        for (int i = 0; i < getallen.length; i++) {
            this.getallen[i] = new Getal(getallen[i]);
        }
    }

    /* Sorteer met de sort methode (zie klasse BubbleSort) */
    public void sort() {
        BubbleSort.sort(getallen);
    }

    /* Sorteer met de sortReversed methode (zie klasse BubbleSort) */
    public void sortReversed() {
        BubbleSort.sortReversed(getallen);
    }

    /* Zorg ervoor dat de gewenste afdruk op het scherm komt */
    public String toString() {
        if (getallen == null) return "";
        StringBuilder sb = new StringBuilder();
        for (Getal getal : getallen) {
            sb.append(getal + " ");

        }
        return sb.toString();
    }
}
