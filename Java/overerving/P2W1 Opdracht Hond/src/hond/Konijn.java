package hond;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 09:58
 */
public class Konijn extends Dier {
    public boolean graaft;

    public Konijn(String naam, String ras, String kleur, String chipnummer){
        super(naam, ras, kleur, chipnummer);
    }

    @Override
    public String toString() {
        return this.naam + " " + ras + " " + kleur + " " + graaft;

    }
}
