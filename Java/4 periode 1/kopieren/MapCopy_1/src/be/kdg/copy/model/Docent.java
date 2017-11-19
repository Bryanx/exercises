package be.kdg.copy.model;

/**
 * Vul aan waar nodig
 */
public class Docent extends Persoon {
    private final String specialisatie;

    public Docent(String naam, String rijksRegisterNummer, String specialisatie) {
        super(naam, rijksRegisterNummer);
        this.specialisatie = specialisatie;
    }

    @Override
    public String toString() {
        return super.toString() + " Specialisatie: " + specialisatie;
    }
}