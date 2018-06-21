package hond;

/**
 * @author Bryan de Ridder
 * @version 1.0 16/11/2016 09:58
 */
public class Dier {
    protected String naam;
    protected String ras;
    protected String kleur;
    protected String chipnummer;

    public Dier(String naam, String ras, String kleur, String chipnummer){
        this.naam = naam;
        this.ras = ras;
        this.kleur = kleur;
        this.chipnummer = chipnummer;
    }

    public Dier(String naam, String ras, String kleur){
        this.naam = naam;
        this.ras = ras;
        this.kleur = kleur;
    }

    public void setNaam(String naam){
        this.naam = naam;
    }

    public String getChipnummer(){
        return chipnummer;
    }

    @Override
    public String toString(){
        return this.naam + " " + ras + " " + kleur;
    }

}
