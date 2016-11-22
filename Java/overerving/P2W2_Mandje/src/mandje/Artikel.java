package mandje;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 17:10
 */
public class Artikel {
    //EIGENSCHAPPEN
    private int artikelnummer;
    private String omschrijving;
    private double prijs;
    private int btwTarief;

    //CONSTRUCTORS
    public Artikel(int artikelnummer, String omschrijving, double prijs, int btwTarief) {
        this.artikelnummer = artikelnummer;
        this.omschrijving = omschrijving;
        this.prijs = prijs;
        this.btwTarief = btwTarief;
    }

    //METHODS
    public int getArtikelnummer() {
        return artikelnummer;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public double getPrijs() {
        return prijs;
    }

    public int getBtwTarief() {
        return btwTarief;
    }

    public double getTotalePrijs() {
        return prijs * (btwTarief/100) + prijs;
    }

    public double getInvoerTaks(){
        return 0.0;
    }

    @Override
    public String toString() {
        return this.artikelnummer + " " + this.omschrijving + " €" + this.prijs + " " + this.btwTarief + "%";
    }
}
