package werk;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 15:03
 */
public class Arbeider extends Werknemer {
    private static final int MAX_UREN_PER_WEEK = 38;
    private int aantalUren;

    public Arbeider(String naam, long nummer, int uren) {
        super(naam, nummer);
        this.aantalUren = uren;
    }

    public double getLoon() {
        int uurloon = 0;
        if (aantalUren > MAX_UREN_PER_WEEK) {
            return MAX_UREN_PER_WEEK * UURLOON +
                    (aantalUren - MAX_UREN_PER_WEEK) * UURLOON * 1.5;
        } else {
            return (double) this.aantalUren * UURLOON;
        }
    }
}
