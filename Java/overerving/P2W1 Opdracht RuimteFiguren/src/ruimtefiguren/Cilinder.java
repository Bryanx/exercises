package ruimtefiguren;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 12:01
 */
public class Cilinder extends RuimteFiguur {
    private double diameter;
    private double lengte;

    public Cilinder(String kleur, double diameter, double lengte) {
        super(kleur);
        this.diameter = diameter;
        this.lengte = lengte;
    }

    public Cilinder(double diameter, double lengte) {
        super("zwart");
        this.diameter = diameter;
        this.lengte = lengte;
    }

    public Cilinder() {
        this(1.0, 1.0);
    }

    public double getDiameter() {
        return diameter;
    }

    public double oppervlakte() {
        return 2 * Math.PI * diameter/2 * (this.lengte + diameter/2);
    }

    public double inhoud() {
        return Math.PI * this.lengte * diameter/2;
    }
}
