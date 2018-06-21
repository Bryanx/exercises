package be.kdg.map;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 15:00
 */
public class Artikel implements Comparable<Artikel> {
    private String naam;
    private double prijs;

    public Artikel(String naam, double prijs) {
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
        return String.format("%-15s €%.2f", this.naam, this.prijs);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artikel artikel = (Artikel) o;

        return Double.compare(artikel.prijs, prijs) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(prijs);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public int compareTo(Artikel o) {
        if (prijs > o.prijs) return -1;
        if (prijs < o.prijs) return 1;
        return 0;
    }
}
