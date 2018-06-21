package bord;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 09:20
 */
public class Bord {
    protected String materiaal;
    protected String kleur;

    public Bord(String materiaal, String kleur) {
        this.materiaal = materiaal;
        this.kleur = kleur;
    }

    public double oppervlakte(){
        return 0.0;
    }

    @Override
    public String toString(){
        return "Materiaal: " + this.materiaal + "\nKleur: " + this.kleur;
    }
}
