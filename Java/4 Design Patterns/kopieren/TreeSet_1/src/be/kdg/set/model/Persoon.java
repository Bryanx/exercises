package be.kdg.set.model;

/**
 * Vul aan waar nodig
 */
public class Persoon implements Comparable<Persoon> {
    private final String naam;

    public Persoon(String naam) {
        this.naam = naam;
    }

    String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return "Naam: " + naam;
    }

    @Override
    public int compareTo(Persoon o) {
        int diff = o.naam.compareTo(this.naam);
        if (diff != 0) return diff;
        if (o instanceof Docent && this instanceof Docent) {
            String spec1 = ((Docent) o).getSpecialisatie();
            String spec2 = ((Docent) this).getSpecialisatie();
            return spec1.compareTo(spec2);
        } else {
            return diff;
        }
    }
}
