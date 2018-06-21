package be.kdg.copy.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Werk de nodige methoden verder uit.
 */
public class Personen {
    private final List<Persoon> personen;

    public Personen() {
        personen = new ArrayList<>();
    }

    public Personen(List<Persoon> personen) {
        this.personen = personen;
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
         * De kopie wordt hier gemaakt, kopieer de volledige collectie met één operatie
         */
    public Personen maakKopie() {
        return new Personen(new ArrayList<>(personen));
    }
}
