package be.kdg.kadotjes;

import java.util.Comparator;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 13:56
 */
public class Geschenk implements Comparable<Geschenk> {
    private String naam;
    private double prijs;

    public Geschenk(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    @Override
    public String toString() {
        return String.format("%-15s €%.2f %n", this.naam, this.prijs);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Geschenk geschenk = (Geschenk) o;

        return naam != null ? naam.equals(geschenk.naam) : geschenk.naam == null;

    }

    @Override
    public int hashCode() {
        return naam != null ? naam.hashCode() : 0;
    }

    @Override
    public int compareTo(Geschenk o) {
        if (prijs > o.prijs) return 1;
        if (prijs < o.prijs) return -1;
        return this.naam.compareTo(o.naam);
    }
}
