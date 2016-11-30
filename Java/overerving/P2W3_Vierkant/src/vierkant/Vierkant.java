package vierkant;


/**
 * @author Bryan de Ridder
 * @version 1.0 29/11/2016 15:55
 */
public class Vierkant extends Figuur {
    private double zijde;

    public Vierkant(double zijde) {
        super("Vierkant");
        this.zijde = zijde;
    }

    @Override
    public double omtrek() {
        return zijde * 4;
    }

    @Override
    public double oppervlakte() {
        return zijde * zijde;
    }

    public void herschaal(int percentage) {
        this.zijde = (zijde * percentage) / 100;
    }

    @Override
    public String toString() {
        return String.format("Soort: \"Vierkant\" Omtrek: %.2f - Oppervlakte: %.2f",
                this.omtrek(),
                this.oppervlakte());
    }
}
