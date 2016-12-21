package be.kdg.map;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 15:44
 */
public class Kind {
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
    public String toString() {
        return String.format("%-15s, %d, %.2f %n",
                this.naam,
                this.leeftijd,
                this.lengte);
    }
}
