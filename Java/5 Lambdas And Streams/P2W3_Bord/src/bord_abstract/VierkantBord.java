package bord_abstract;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 10:07
 */
public class VierkantBord extends Bord {
    private double zijde;

    public VierkantBord(String materiaal, String kleur, double zijde) {
        super(materiaal, kleur);
        this.zijde = zijde;
    }

    @Override
    public double oppervlakte() {
        return zijde * zijde;
    }
}
