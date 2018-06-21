package vogels;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * PEER TUTORING
 * P2W6
 */

// gegeven, mag je wijzigen
public abstract class Vogel implements Comparable<Vogel> {

    // gegeven, mag je niet wijzigen
    private String naam;
    private Habitat habitat;

    // gegeven, mag je niet wijzigen
    public Vogel(String naam, Habitat habitat) {
        this.naam = naam;
        this.habitat = habitat;
    }

    // hier aanvullen


    public String getNaam() {
        return naam;
    }

    public static void gesorteerd(List<Vogel> v) {
        Collections.sort(v);
    }

    public static boolean isTrekker(Vogel v) {
        return v instanceof TrekVogel;
    }

    public static Habitat verblijftIn(Vogel v) {
        return v.habitat;
    }

    @Override
    public int compareTo(Vogel o) {
        return naam.compareTo(o.naam);
    }

    @Override
    public String toString() {
        return String.format("%-20s habitat: %10s",
                this.naam,
                this.habitat);
    }
}
