package dieren;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 10:42
 */
public class Struisvogel implements Dier, Eierleggend {
    private String naam;
    private int aantalEierenPerJaar;

    public Struisvogel(String naam, int aantalEierenPerJaar) {
        this.naam = naam;
        this.aantalEierenPerJaar = aantalEierenPerJaar;
    }

    @Override
    public String getNaam() {
        return this.naam;
    }

    @Override
    public int getAantalEierenPerJaar() {
        return this.aantalEierenPerJaar;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s %nEieren: %d %n",
                this.getNaam(),
                this.getAantalEierenPerJaar());
    }
}
