package be.kdg;

import java.util.Objects;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/09/17 15:26
 */
public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return naam + " " + leeftijd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoon persoon = (Persoon) o;
        return leeftijd == persoon.leeftijd &&
                Objects.equals(naam, persoon.naam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, leeftijd);
    }
}
