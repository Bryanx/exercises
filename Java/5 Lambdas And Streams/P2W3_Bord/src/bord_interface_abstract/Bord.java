package bord_interface_abstract;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 09:20
 */
public abstract class Bord implements Berekenbaar {
    protected String materiaal;
    protected String kleur;

    public Bord(String materiaal, String kleur) {
        this.materiaal = materiaal;
        this.kleur = kleur;
    }

    @Override
    public abstract double oppervlakte();

    @Override
    public String toString(){
        return String.format("%-15s %-15s",
                this.materiaal,
                this.kleur);
    }
}
