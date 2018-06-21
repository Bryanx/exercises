package factorydemo;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/10/17 20:44
 */
public class Vierkant implements Figuur {

    private double zijde;

    public double getZijde() {
        return zijde;
    }

    private Vierkant(double zijde) {
        this.zijde = zijde;
    }

    public static Vierkant newVierkant(double zijde) {
        return new Vierkant(zijde);
    }

    @Override
    public double oppervlakte() {
        return zijde*zijde;
    }

    @Override
    public String toString() {
        return String.format("Vierkant %.1f", zijde);
    }
}
