package be.kdg.copy.model;

/**
 * Vul aan waar nodig
 */
public class Student extends Persoon {
    private final int klasGroep;

    public Student(String naam, String rijksRegisterNummer, int klasGroep) {
        super(naam, rijksRegisterNummer);
        this.klasGroep = klasGroep;
    }

    @Override
    public String toString() {
        return super.toString() + " Groep: " + klasGroep;
    }
}
