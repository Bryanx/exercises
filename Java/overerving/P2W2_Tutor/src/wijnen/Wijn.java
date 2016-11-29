package wijnen;

import java.time.LocalDate;

/**
 * PEER opdracht
 * P2W2
 */
public class Wijn {
    private String naam;
    private String streek;
    private LocalDate oogstDatum;
    private double basisPrijs;

    public Wijn(String naam, String streek, LocalDate oogstDatum, double basisPrijs) {
        this.naam = naam;
        this.streek = streek;
        this.oogstDatum = oogstDatum;
        this.basisPrijs = basisPrijs;
    }

    public String getNaam() {
        return naam;
    }

    public String getStreek() {
        return streek;
    }

    public LocalDate getOogstDatum() {
        return oogstDatum;
    }

    double getBasisPrijs() {
        return basisPrijs;
    }

    public double berekenPrijs() {
        return basisPrijs;
    }

    public final String getKenmerken() {
        return "Van " + this.oogstDatum + " afkomstig uit " + this.streek;
    }

    @Override
    public String toString() {
        return String.format("%-50s €%7.2f %n\t (%s)",
                this.naam,
                this.berekenPrijs(),
                this.getKenmerken());
    }
}
