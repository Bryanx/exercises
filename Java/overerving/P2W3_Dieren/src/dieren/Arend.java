package dieren;

/**
 * @author Bryan de Ridder
 * @version 1.0 30/11/2016 10:40
 */
public class Arend implements Dier, Eierleggend, Vliegend {
    private String naam;
    private int aantalEierenPerJaar;
    private int maxSnelheid;
    private int duikSnelheid;

    public Arend(String naam, int aantalEierenPerJaar, int maxSnelheid, int duikSnelheid) {
        this.naam = naam;
        this.aantalEierenPerJaar = aantalEierenPerJaar;
        this.maxSnelheid = maxSnelheid;
        this.duikSnelheid = duikSnelheid;
    }

    public int getMaxSnelheid() {
        return maxSnelheid;
    }

    public int getDuikSnelheid() {
        return duikSnelheid;
    }

    @Override
    public String getNaam() {
        return this.naam;
    }

    @Override
    public int getMaxVliegsnelheid() {
        return this.getMaxSnelheid();
    }

    @Override
    public int getAantalEierenPerJaar() {
        return this.aantalEierenPerJaar;
    }

    @Override
    public String toString() {
        return String.format("Naam: %s %nEieren: %d %nSnelheid: %d km/h %nDuiksnelheid: %d km/h %n",
                this.getNaam(),
                this.getAantalEierenPerJaar(),
                this.maxSnelheid,
                this.duikSnelheid);
    }
}
