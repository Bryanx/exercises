package be.kdg.set.model;

/**
 * Vul aan waar nodig
 */
public class Persoon {
    private final String naam;

    public Persoon(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Naam: " + naam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persoon persoon = (Persoon) o;

        return naam != null ? naam.equals(persoon.naam) : persoon.naam == null;
    }

    @Override
    public int hashCode() {
        return naam != null ? naam.hashCode() : 0;
    }
}
