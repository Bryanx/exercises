package be.kdg.set.model;

import java.util.*;

/**
 * Werk de nodige methoden verder uit.
 */
public class Personen {
    private final Set<Persoon> personen;

    public Personen() {
        personen = new LinkedHashSet<>();
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
