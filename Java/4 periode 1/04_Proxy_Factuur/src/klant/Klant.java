package klant;

/**
 * HIER NIETS WIJZIGEN!
 */
public class Klant {
    private String naam;
    private Adres adres;
    private String klantID;

    public Klant(String naam, Adres adres, String klantID) {
        this.naam = naam;
        this.adres = adres;
        this.klantID = klantID;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String getKlantID() {
        return klantID;
    }

    public void setKlantID(String klantID) {
        this.klantID = klantID;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)\n%s", naam, klantID, adres);
    }
}
