package be.kdg.sort.model;

/**
 * Vul aan waar nodig
 */
public class Student extends Persoon {
    private final int klasGroep;

    public Student(String naam, int leeftijd, int klasGroep) {
        super(naam, leeftijd);
        this.klasGroep = klasGroep;
    }

    @Override
    public String toString() {
        return super.toString() + " Groep: " + klasGroep;
    }
}
