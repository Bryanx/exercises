package be.kdg.set.model;

import java.util.Set;
import java.util.TreeSet;

/**
 * Werk de nodige methoden verder uit.
 */
public class Personen {
    private Set<Persoon> personen;

    public Personen() {
        personen = new TreeSet<>();
    }

    public void voegPersoonToe(Persoon persoon) {
        personen.add(persoon);
    }

    public String maakPersonenString() {
        StringBuilder sb = new StringBuilder();
        for (Persoon persoon : personen) {
            sb.append(persoon + "\n");
        }
        return sb.toString();
    }
}
