package be.kdg.generics;

public class Dier implements Comparable<Dier> {
    private String naam;

    public Dier(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return naam;
    }

    @Override
    public int compareTo(Dier ander) {
        return naam.compareTo(ander.naam);
    }
}
