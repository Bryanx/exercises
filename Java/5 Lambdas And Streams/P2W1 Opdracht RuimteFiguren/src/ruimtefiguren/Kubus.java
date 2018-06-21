package ruimtefiguren;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 12:06
 */
public class Kubus extends RuimteFiguur {
    private double ribbe;

    public Kubus(String kleur, double ribbe) {
        super(kleur);
        this.ribbe = ribbe;
    }

    public Kubus(double ribbe) {
        super("zwart");
        this.ribbe = ribbe;
    }

    public Kubus(){
        this(1.0);
    }

    public double getRibbe() {
        return ribbe;
    }

    public double oppervlakte() {
        return 6 * ribbe * ribbe;
    }

    public double inhoud() {
        return Math.pow(ribbe, 3);
    }
}
