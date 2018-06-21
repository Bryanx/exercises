package be.kdg.sort.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Werk de nodige methoden verder uit.
 */
public class Personen {
    private final List<Persoon> personen;

    public Personen() {
        personen = new ArrayList<>();
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

		// TODO: sorteer volgens dalende leeftijd
    public void sorteer() {
        Collections.sort(personen, new Comparator<Persoon>() {
            @Override
            public int compare(Persoon o1, Persoon o2) {
                return o2.getLeeftijd() - o1.getLeeftijd();
            }
        });
    }
}
