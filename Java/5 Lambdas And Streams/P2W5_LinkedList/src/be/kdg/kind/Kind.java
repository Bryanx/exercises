package be.kdg.kind;

/**
 * @author Bryan de Ridder
 * @version 1.0 14/12/2016 10:58
 */
public class Kind implements Comparable<Kind> {
    private String naam;
    private int leeftijd;
    private double lengte;

    public Kind(String naam, int leeftijd, double lengte) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.lengte = lengte;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public double getLengte() {
        return lengte;
    }

    @Override
    public int compareTo(Kind other) {
        return naam.compareTo(other.naam);
    }

    @Override
    public String toString() {
        return String.format("Naam: %-20s Leeftijd: %-20d Lengte: %.2f",
                this.naam,
                this.leeftijd,
                this.lengte);
    }
}
