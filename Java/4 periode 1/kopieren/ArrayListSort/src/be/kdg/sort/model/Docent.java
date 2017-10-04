package be.kdg.sort.model;

/**
 * Vul aan waar nodig
 */
public class Docent extends Persoon {
    private final String specialisatie;

    public Docent(String naam, int leeftijd, String specialisatie) {
        super(naam, leeftijd);
        this.specialisatie = specialisatie;
    }

    @Override
    public String toString() {
        return super.toString() + " Specialisatie: " + specialisatie;
    }
}
