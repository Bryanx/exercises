package boerderij;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 14:58
 */
public class Kip extends Dier {
    private int aantalEierenPerWeek;

    public Kip(String naam, int aantalEieren) {
        super(naam, "toook took", "graan");
        this.aantalEierenPerWeek = aantalEieren;
    }
}
