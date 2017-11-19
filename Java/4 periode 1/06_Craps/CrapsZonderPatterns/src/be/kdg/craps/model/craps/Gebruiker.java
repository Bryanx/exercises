package be.kdg.craps.model.craps;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/10/17 13:55
 */
public class Gebruiker {
    private String naam;
    private String wachtwoord;

    public Gebruiker(String naam, String wachtwoord) {
        this.naam = naam;
        this.wachtwoord = wachtwoord;
    }

    public String getNaam() {
        return naam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }
}
