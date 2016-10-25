package verkoper;

/**
 * @author Bryan de Ridder
 * @version 1.0 25/10/2016 22:42
 */
public class Verkoper {
    private String naam;
    private double omzet;

    //CONSTRUCTORS
    public Verkoper(String naam, double omzet) {
        this.naam = naam;
        this.omzet = omzet;
    }

    //METHODS
    public boolean heeftGrotereOmzet(Verkoper nr1, Verkoper nr2) {
        if (this.omzet > nr1.omzet && this.omzet > nr2.omzet) {
            return true;
        } else {
            return false;
        }
    }
    public String getNaam() {
        return this.naam;
    }

    public double getOmzet() {
        return this.omzet;
    }
}
