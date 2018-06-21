package vierkant;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/2016 16:08
 */
public class Rechthoek extends Figuur {
    private double breedte;
    private double hoogte;

    public Rechthoek(double breedte, double hoogte) {
        super("Rechthoek");
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    @Override
    public double omtrek() {
        return breedte * 2 + hoogte * 2;
    }

    @Override
    public double oppervlakte() {
        return breedte * hoogte;
    }

    @Override
    public void herschaal(int percentage) {
        this.breedte = (breedte * percentage) / 100;
        this.hoogte = (hoogte * percentage) / 100;
    }

    @Override
    public String toString() {
        return String.format("Soort: \"Rechthoek\" Omtrek: %.2f - Oppervlakte: %.2f",
                this.omtrek(),
                this.oppervlakte());
    }
}
