package facturatie;

import artikel.Artikel;
import klant.Klant;

import java.lang.instrument.UnmodifiableClassException;

/**
 * @author Bryan de Ridder
 * @version 1.0 25/10/17 16:56
 */
public class OnwijzigbareFactuur implements Factureerbaar {


    private Factuur factuur;

    public OnwijzigbareFactuur(Factuur factuur) {
        this.factuur = factuur;
    }

    @Override
    public Klant getKlant() {
        return factuur.getKlant();
    }

    @Override
    public String getDatum() {
        return factuur.getDatum();
    }

    @Override
    public void setDatum(String datum) {
        throw new UnsupportedOperationException("Factuurdatum kan niet gewijzigd worden");
    }

    @Override
    public void setKlant(Klant klant) {
        throw new UnsupportedOperationException("Klantgegevens kunnen niet gewijzigd worden");
    }

    @Override
    public int getFactuurNr() {
        return factuur.getFactuurNr();
    }

    @Override
    public void voegLijnToe(Artikel artikel, int aantal) {
        throw new UnsupportedOperationException("Er kunnen geen factuurlijnen worden toegevoegd");
    }

    @Override
    public void verwijderLijn(Artikel artikel) {
        throw new UnsupportedOperationException("Er kunnen geen factuurlijnen verwijderd worden");
    }

    @Override
    public double getTotaalExcl() {
        return factuur.getTotaalExcl();
    }

    @Override
    public double getBTW() {
        return factuur.getBTW();
    }

    @Override
    public double getTotaalIncl() {
        return factuur.getTotaalIncl();
    }

    @Override
    public void printFactuur() {
        factuur.printFactuur();
    }
}
