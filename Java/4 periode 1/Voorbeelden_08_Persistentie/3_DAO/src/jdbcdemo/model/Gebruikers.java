package jdbcdemo.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Multiklasse Gebruikers die oa testgegevens bevat
 */
public class Gebruikers {
    private List<Gebruiker> gebruikers;

    public Gebruikers() {
        gebruikers = new ArrayList<>();
        vulArrayList();
    }

    public Gebruikers(List<Gebruiker> gebruikers) {
        this.gebruikers = gebruikers;
    }

    public List<Gebruiker> getGebruikers() {
        return Collections.unmodifiableList(gebruikers);
    }

    public int getSize() {
        return gebruikers.size();
    }

    private void vulArrayList() {
        gebruikers.add(new Gebruiker(1, "Jos", "Gils", "gils", "swordfish"));
        gebruikers.add(new Gebruiker(2, "Erik", "Goossens", "goose", "matrix"));
        gebruikers.add(new Gebruiker(3, "Theo", "Jansens", "jans", "sleepless"));
        gebruikers.add(new Gebruiker(4, "Luc", "Lambrecht", "lam", "stigmata"));
        gebruikers.add(new Gebruiker(5, "Ronny", "Verlinden", "ronny", "silence"));
        gebruikers.add(new Gebruiker(6, "Kris", "Van Gompel", "gompy", "outbreak"));
        gebruikers.add(new Gebruiker(7, "Els", "D'Heer", "d'heer", "o'cool"));
        gebruikers.add(new Gebruiker(8, "Tom", "Van den Eede", "tom", "nightowl"));
    }
}
