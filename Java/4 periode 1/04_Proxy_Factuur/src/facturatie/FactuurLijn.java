package facturatie;

import artikel.Artikel;

/**
 * HIER NIETS WIJZIGEN!
 */
public class FactuurLijn {
    private Artikel artikel;
    private int aantal;

    public FactuurLijn(Artikel artikel, int aantal) {
        this.artikel = artikel;
        this.aantal = aantal;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    @Override
    public String toString() {
        return String.format("%-40s %5dx", artikel, aantal);
    }
}
