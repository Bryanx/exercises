package boerderij;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/2016 14:56
 */
public class Dier {
    protected String naam;
    protected String geluid;
    protected String voeding;

    public Dier(String naam, String geluid, String voeding) {

        this.naam = naam;
        this.geluid = geluid;
        this.voeding = voeding;
    }

    public String getNaam() {
        return naam;
    }

    public String getGeluid() {
        return geluid;
    }

    public String getVoeding() {
        return voeding;
    }

    @Override
    public String toString(){
        return String.format("%s maakt geluid \"%s\" en eet %s",
        this.naam, this.geluid, this.voeding);
    }
}
