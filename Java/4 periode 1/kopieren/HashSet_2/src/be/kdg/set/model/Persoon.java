package be.kdg.set.model;

import java.util.Objects;

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
        if (o instanceof Docent) return false;
        Persoon persoon = (Persoon) o;
        return Objects.equals(naam, persoon.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam);
    }
}
