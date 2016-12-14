package be.kdg.drank;

/**
 * @author Bryan de Ridder
 * @version 1.0 14/12/2016 09:15
 */
public class Drank implements Comparable<Drank> {
    private String naam;
    private double prijs;
    private boolean isAlcoholisch;

    public Drank(String naam, double prijs, boolean isAlcoholisch) {
        this.naam = naam;
        this.prijs = prijs;
        this.isAlcoholisch = isAlcoholisch;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public boolean isAlcoholisch() {
        return isAlcoholisch;
    }

    @Override
    public String toString() {
        return String.format("%s €%.2f %b",
                this.naam,
                this.prijs,
                this.isAlcoholisch);
    }

    @Override
    public int compareTo(Drank other) {
        if (prijs > other.prijs) return 1;
        if (prijs < other.prijs) return -1;
        //als de prijs hetzelfde is
        //vergelijken op naam:
        return naam.compareTo(other.naam);
    }
}
