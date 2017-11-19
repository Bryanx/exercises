package be.kdg.demo.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hier mag je niets wijzigen!
 */
public class Verzameling {
    private List<Film> verzameling;

    public Verzameling() {
        verzameling = new ArrayList<>();
    }

    public List<Film> getVerzameling() {
        return Collections.unmodifiableList(verzameling);
    }

    public void add(Film film) {
        if (!verzameling.contains(film)) {
            verzameling.add(film);
        }
    }

    public void sorteer() {
        Collections.sort(verzameling);
    }
}
