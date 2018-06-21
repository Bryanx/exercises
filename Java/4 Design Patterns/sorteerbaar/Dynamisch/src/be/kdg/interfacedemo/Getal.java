package be.kdg.interfacedemo;

/**
 * Vul aan waar nodig.
 *
 * Maak gebruik van zowel de Sorteerbaar als de Comparable interface.
 */
public final class Getal implements Comparable<Getal>{
    private final int getal;

    public Getal(int getal) {
        this.getal = getal;
    }

    /* Deze methode geeft true terug als het eerste getal
     * kleiner is dan het tweede.
     */
    public boolean kleinerDan(Sorteerbaar sorteerbaar) {
        int getal2 = Integer.parseInt(sorteerbaar.toString());
        return getal - getal2 < 0;
    }

    /* Deze methode doet net het omgekeerde */
    public boolean groterDan(Sorteerbaar sorteerbaar) {
        return !kleinerDan(sorteerbaar);
    }

    /* Hier zet je een getalwaarde om naar een String, reeds uigewerkt. */
    public String toString() {
        return Integer.toString(getal);
    }


    @Override
    public int compareTo(Getal o) {
        return getal - Integer.parseInt(o.toString());
    }
}
