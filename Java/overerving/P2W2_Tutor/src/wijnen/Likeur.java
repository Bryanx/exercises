package wijnen;

import java.time.LocalDate;

/**
 * PEER opdracht
 * P2W2
 */
public class Likeur extends Wijn {
    private double alcoholGehalte; //in procent

    public Likeur(String naam, String streek, LocalDate oogstDatum, double basisPrijs, double alcohol) {
        super(naam, streek, oogstDatum, basisPrijs);
        this.alcoholGehalte = alcohol;
    }

    @Override
    public double berekenPrijs() {
        if (alcoholGehalte > 50) {
            return super.getBasisPrijs() * 1.25;
        } else {
            return super.getBasisPrijs();
        }
    }

    @Override
    public String toString() {
        return super.toString() + " --> " + this.alcoholGehalte + "% alc";
    }
}
