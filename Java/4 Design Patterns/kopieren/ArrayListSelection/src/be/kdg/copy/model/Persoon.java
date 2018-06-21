package be.kdg.copy.model;

/**
 * Vul aan waar nodig
 */
public class Persoon implements Comparable<Persoon> {
    private final String naam;

    public Persoon(String naam) {
        this.naam = naam;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Persoon persoon = (Persoon) object;

        return naam.equals(persoon.naam);
    }

    @Override
    public int hashCode() {
        return naam.hashCode();
    }

    @Override
    public String toString() {
        return "Naam: " + naam;
    }

    @Override
    public int compareTo(Persoon anderePersoon) {
        return naam.compareTo(anderePersoon.naam);  
    }
}
