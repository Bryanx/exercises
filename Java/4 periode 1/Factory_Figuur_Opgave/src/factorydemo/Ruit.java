package factorydemo;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/10/17 20:53
 */
public class Ruit implements Figuur {

    private double groteDiagonaal;
    private double kleineDiagonaal;

    public double getGroteDiagonaal() {
        return groteDiagonaal;
    }

    public double getKleineDiagonaal() {
        return kleineDiagonaal;
    }

    private Ruit(double groteDiagonaal, double kleineDiagonaal) {
        this.groteDiagonaal = groteDiagonaal;
        this.kleineDiagonaal = kleineDiagonaal;
    }

    public static Ruit newRuit(double groot, double klein) {
        return new Ruit(groot, klein);
    }

    @Override
    public double oppervlakte() {
        return groteDiagonaal * kleineDiagonaal;
    }

    @Override
    public String toString() {
        return String.format("Ruit %.1f %.1f", groteDiagonaal, kleineDiagonaal);
    }
}
