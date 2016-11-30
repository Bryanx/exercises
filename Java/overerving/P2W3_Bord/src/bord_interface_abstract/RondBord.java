package bord_interface_abstract;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 09:22
 */
public class RondBord extends Bord {
    private double diameter;


    public RondBord(String materiaal, String kleur, double diameter) {
        super(materiaal, kleur);
        this.diameter = diameter;
    }

    @Override
    public double oppervlakte() {
        return Math.pow(diameter/2,2)*Math.PI;
    }
}
