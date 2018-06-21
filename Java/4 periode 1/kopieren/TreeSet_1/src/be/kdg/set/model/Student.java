package be.kdg.set.model;

/**
 * Vul aan waar nodig
 */
public class Student extends Persoon {
    private final int klasGroep;

    public Student(String naam, int klasGroep) {
        super(naam);
        this.klasGroep = klasGroep;
    }

    @Override
    public String toString() {
        return super.toString() + " Groep: " + klasGroep;
    }
}
