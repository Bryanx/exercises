package mandje;

/**
 * @author Bryan de Ridder
 * @version 1.0 23/11/2016 08:50
 */
public class ImportArtikel extends Artikel {
    double invoerTaks;

    public ImportArtikel(int artikelnummer, String omschrijving, double prijs, int btwTarief, double taks) {
        super(artikelnummer, omschrijving, prijs, btwTarief);
        this.invoerTaks = taks;
    }

    public double getInvoer
}
