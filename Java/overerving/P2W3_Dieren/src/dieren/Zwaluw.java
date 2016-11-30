package dieren;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 10:43
 */
public class Zwaluw implements Dier, Eierleggend, Vliegend {
    private String naam;
    private int aantalEierenPerJaar;
    private int maxSnelheid;

    public Zwaluw(String naam, int aantalEierenPerJaar, int maxSnelheid) {
        this.naam = naam;
        this.aantalEierenPerJaar = aantalEierenPerJaar;
        this.maxSnelheid = maxSnelheid;
    }

    public int getMaxSnelheid() {
        return maxSnelheid;
    }

    @Override
    public String getNaam() {
        return this.naam;
    }

    @Override
    public int getMaxVliegsnelheid() {
        return this.maxSnelheid;
    }

    @Override
    public int getAantalEierenPerJaar() {
        return this.aantalEierenPerJaar;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s %nEieren: %d %nSnelheid: %d km/h %n",
                this.getNaam(),
                this.getAantalEierenPerJaar(),
                this.maxSnelheid);
    }
}
