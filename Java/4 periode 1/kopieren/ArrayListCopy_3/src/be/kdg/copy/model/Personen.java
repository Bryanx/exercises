package be.kdg.copy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Werk de nodige methoden verder uit.
 */
public class Personen {
    private List<Persoon> personen;

    public Personen() {
        personen = new ArrayList<>();
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
     * TODO: Kopie wordt hier gemaakt (gebruik een alternatieve werkwijze!).
     */
    public Personen maakKopie() {
        Personen kopie = new Personen();
        kopie.personen.addAll(personen);
        return kopie;
    }
}
