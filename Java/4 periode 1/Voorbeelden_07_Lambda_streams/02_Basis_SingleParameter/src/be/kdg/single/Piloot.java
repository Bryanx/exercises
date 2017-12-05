package be.kdg.single;

public class Piloot {
    private String naam;

    public Piloot(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        return naam;
    }
}
