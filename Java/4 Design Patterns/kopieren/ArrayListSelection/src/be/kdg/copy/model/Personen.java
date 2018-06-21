package be.kdg.copy.model;

import java.util.*;

/**
 * Werk de nodige methoden verder uit.
 */
public class Personen {
    private List<Persoon> personen;

    public Personen() {
        personen = new ArrayList<Persoon>();
    }

    public void voegPersoonToe(Persoon ander) {
        personen.add(ander);
    }

    public String maakPersonenString() {
        StringBuilder sb = new StringBuilder();
        for (Persoon persoon : personen) {
            sb.append(persoon + "\n");
        }
        return sb.toString();
    }

    /*
     * Todo: Maak een kopie waarin de dubbels verwijderd werden
     */
    public Personen maakKopie() {
        Personen kopie = new Personen();
        Set<Persoon> set = new HashSet<>(personen);
        kopie.personen.addAll(set);
        return kopie;
    }
}
