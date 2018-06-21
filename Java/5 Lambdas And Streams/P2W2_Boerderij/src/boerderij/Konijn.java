package boerderij;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 14:58
 */
public class Konijn extends Dier {
    private boolean isGraver;

    public Konijn(String naam, boolean isGraver) {
        super(naam, "snuff snuff", "hooi");
        this.isGraver = isGraver;
    }

    public String toString() {
        return super.toString() + " en graaft " +
                (isGraver?"wel":"niet");
    }


}
