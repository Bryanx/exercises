package be.kdg.set.model;

/**
 * Vul aan waar nodig
 */
public class Docent extends Persoon {
    private final String specialisatie;

    public Docent(String naam, String specialisatie) {
        super(naam);
        this.specialisatie = specialisatie;
    }

    @Override
    public String toString() {
        return super.toString() + " Specialisatie: " + specialisatie;
    }
}
