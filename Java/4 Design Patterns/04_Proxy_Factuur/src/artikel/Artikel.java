package artikel;

/**
 * HIER NIETS WIJZIGEN!
 */
public class Artikel {
    private String artNr;
    private String omschrijving;
    private double prijs;

    public Artikel(String artNr, String omschrijving, double prijs) {
        this.artNr = artNr;
        this.omschrijving = omschrijving;
        this.prijs = prijs;
    }

    public String getArtNr() {
        return artNr;
    }

    public void setArtNr(String artNr) {
        this.artNr = artNr;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artikel artikel = (Artikel) o;

        if (artNr != null ? !artNr.equals(artikel.artNr) : artikel.artNr != null) return false;
        if (omschrijving != null ? !omschrijving.equals(artikel.omschrijving) : artikel.omschrijving != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artNr != null ? artNr.hashCode() : 0;
        result = 31 * result + (omschrijving != null ? omschrijving.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("artikel %-8s %-30s %8.2f€", artNr, omschrijving, prijs);
    }
}
