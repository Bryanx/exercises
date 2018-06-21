package be.kdg.generics;

/**
 * @author Bryan de Ridder
 * @version 1.0 29/09/17 15:02
 */
public class Dier implements Comparable<Dier>{
    private String naam;

    public Dier(String naam) {
        this.naam = naam;
    }

    @Override
    public int compareTo(Dier o) {
        return this.naam.compareTo(o.naam);
    }

    @Override
    public String toString() {
        return naam;
    }
}
