package be.kdg.generics;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/09/17 15:04
 */
public class Persoon {
    private String naam;
    private int lengte;
    private int gewicht;

    public Persoon(String naam, int lengte, int gewicht) {
        this.naam = naam;
        this.lengte = lengte;
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return "["+naam+", "+lengte+"cm, "+gewicht+"kg]";
    }
}
