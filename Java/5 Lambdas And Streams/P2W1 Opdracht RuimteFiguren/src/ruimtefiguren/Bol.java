package ruimtefiguren;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 11:54
 */
public class Bol extends RuimteFiguur {
    private double straal;

    public Bol(String kleur, double straal) {
        super(kleur);
        this.straal = straal;
    }

    public Bol(double straal) {
        super("zwart");
        this.straal = straal;
    }

    public Bol() {
        this(1.0);
    }

    public double getStraal() {
        return straal;
    }

    public double oppervlakte() {
        return 4 * Math.PI * straal * straal;
    }

    public double inhoud() {
        return 4.0 / 3.0 * Math.PI * Math.pow(straal, 3);
    }
}
