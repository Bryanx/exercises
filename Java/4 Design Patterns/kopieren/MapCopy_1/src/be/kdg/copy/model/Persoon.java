package be.kdg.copy.model;

/**
 * Vul aan waar nodig
 */
public class Persoon {
    private final String naam;
    private final String rijksRegisterNummer;

    public Persoon(String naam, String rijksRegisterNummer) {
        this.naam = naam;
        this.rijksRegisterNummer = rijksRegisterNummer;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return "Naam: " + naam + " Nummer: " + rijksRegisterNummer;
    }
}
