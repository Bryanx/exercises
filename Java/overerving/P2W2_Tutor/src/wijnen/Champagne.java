package wijnen;

import java.time.LocalDate;

/**
 * PEER opdracht
 * P2W2
 */
public class Champagne extends Wijn {
    private Smaak smaak;


    public Champagne(String naam, String streek, LocalDate oogstDatum, double basisPrijs, Smaak smaak) {
        super(naam, streek, oogstDatum, basisPrijs);
        this.smaak = smaak;
    }

    @Override
    public double berekenPrijs() {
        if (smaak == Smaak.BRUT || smaak == Smaak.BRUT_SANS_MILLESIME || smaak == Smaak.EXTRA_BRUT) {
            return super.getBasisPrijs() * 1.10;
        }
        return super.getBasisPrijs();
    }

    @Override
    public String toString() {
        return super.toString() + " --> Type: " + this.smaak ;
    }
}
