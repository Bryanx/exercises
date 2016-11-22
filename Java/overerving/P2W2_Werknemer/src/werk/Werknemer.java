package werk;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 15:01
 */
public abstract class Werknemer {
    public static final double UURLOON = 12.5F;
    protected String naam;
    protected long rijksRegisterNummer;

    public Werknemer(String naam, long rijksRegisterNummer) {
        this.naam = naam;
        this.rijksRegisterNummer = rijksRegisterNummer;
    }

    public abstract double getLoon();

    @Override
    public String toString() {
        return String.format("naam: %s %nrijksregisternummer: %s %nLoon: € %.1f %n",
                this.naam,
                this.rijksRegisterNummer,
                getLoon());
    }
}
