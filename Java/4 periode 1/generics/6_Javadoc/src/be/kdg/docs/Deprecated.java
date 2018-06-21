package be.kdg.docs;

public class Deprecated {
    private boolean geldig;

    /**
     * Geeft aan of de sessie geldig is.
     * @return true bij een geldige sessie, anders false
     * @deprecated Sinds versie 1.1, gebruik de {@link #isGeldig() isGeldig} methode.
     */
    public boolean geldig() {
        return geldig;
    }

    public boolean isGeldig() {
        return geldig;
    }

}
