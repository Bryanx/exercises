package hond;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 09:55
 */
public class Hond extends Dier {
    private String slogan = "Blaffende honden bijten niet";

    public Hond(String naam, String ras, String kleur, String chipnummer){
        super(naam, ras, kleur, chipnummer);
    }

    public String getSlogan() {
        return slogan;
    }
}
