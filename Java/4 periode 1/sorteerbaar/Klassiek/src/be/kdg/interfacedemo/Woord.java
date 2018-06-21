package be.kdg.interfacedemo;

/**
 * Vul aan waar nodig.
 * <p>
 * Maak gebruik van de Sorteerbaar interface.
 */
public final class Woord implements Sorteerbaar {
    private final String woord;

    public Woord(String woord) {
        this.woord = woord;
    }

    /* Deze methode geeft true terug als het eerste woord alfabetisch
     * voor het tweede komt.
     */
    public boolean kleinerdan(Sorteerbaar sorteerbaar) {
        int i = 0;
        while (i < sorteerbaar.toString().length()-1) {
            if (woord.charAt(i) < sorteerbaar.toString().charAt(i)) {
                return true;
            } else if (woord.charAt(i) > sorteerbaar.toString().charAt(i)) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }

    /* Deze methode doet het omgekeerde van de voorgaande */
    public boolean groterDan(Sorteerbaar sorteerbaar) {
        return !kleinerdan(sorteerbaar);
    }

    public String toString() {
        return woord;
    }
}
