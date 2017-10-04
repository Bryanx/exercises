package be.kdg.interfacedemo;

/**
 * Vul aan waar nodig.
 *
 * Maak gebruik van zowel de Sorteerbaar als de Comparable interface.
 */
public final class Woord implements Sorteerbaar, Comparable<Woord>  {
    private final String woord;

    public Woord(String woord) {
        this.woord = woord;
    }

    /* Deze methode geeft true terug als het eerste woord alfabetisch
     * voor het tweede komt.
     */
    public boolean kleinerDan(Sorteerbaar sorteerbaar) {
        return (woord.charAt(0) < sorteerbaar.toString().charAt(0));
    }

    /* Deze methode doet het omgekeerde van de voorgaande */
    public boolean groterDan(Sorteerbaar sorteerbaar) {
        return !kleinerDan(sorteerbaar);
    }

    public String toString() {
        return woord;
    }

    @Override
    public int compareTo(Woord o) {
        return woord.compareTo(o.toString());
    }
}
