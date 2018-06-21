package be.kdg.copy.model;

/**
 * Vul aan waar nodig
 */
public class Persoon {
    private final String naam;

    public Persoon(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Naam: " + naam;
    }
}
