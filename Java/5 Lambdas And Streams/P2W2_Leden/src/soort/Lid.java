package soort;

/**
 * @author Bryan de Ridder
 * @version 1.0 26/11/2016 14:46
 */
public class Lid {
    public static int aantalLeden = 0;
    private int lidnummer = 1000;
    protected String naam;
    protected Soort soort;

    public Lid(String naam, Soort soort) {
        this.naam = naam;
        this.soort = soort;
        if (soort == Soort.STEUNEND) {
            this.lidnummer = 1000;
        } else {
            aantalLeden++;
            this.lidnummer = lidnummer + aantalLeden;
        }
    }

    public int getLidnummer() {
        return lidnummer;
    }

    public static int getAantalLeden() {
        return aantalLeden;
    }

    @Override
    public String toString() {
        return String.format("%d %-20s soort: %s",
                this.getLidnummer(),
                this.naam,
                this.soort);
    }
}
