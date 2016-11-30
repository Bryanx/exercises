package bord;

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
        return zijde*zijde;
    }

    @Override
    public String toString(){
        return String.format("%-10s %-10s %-10s %.0fcm²",
                "Vierkant",
                this.materiaal,
                this.kleur,
                this.oppervlakte());
    }
}
