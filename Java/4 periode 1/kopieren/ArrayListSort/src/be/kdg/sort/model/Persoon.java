package be.kdg.sort.model;

/**
 * Vul aan waar nodig
 */
public class Persoon {
    private final String naam;
    private final int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    @Override
    public String toString() {
        return "Naam: " + naam + "  Leeftijd: " + leeftijd;
    }
}
