package factorydemo;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/10/17 20:49
 */
public class Rechthoek implements Figuur {

    private double breedte;
    private double hoogte;

    public double getBreedte() {
        return breedte;
    }

    public double getHoogte() {
        return hoogte;
    }

    private Rechthoek(double breedte, double hoogte) {
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public static Rechthoek newRechthoek(double breedte, double hoogte) {
        return new Rechthoek(breedte, hoogte);
    }

    @Override
    public double oppervlakte() {
        return breedte * hoogte;
    }

    @Override
    public String toString() {
        return String.format("Rechthoek %.1f %.1f", breedte, hoogte);
    }
}
