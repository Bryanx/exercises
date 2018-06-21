package be.kdg.copy.model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Werk de nodige methoden verder uit.
 */
public class Personen {
    private List<Persoon> personen;

    public Personen() {
        personen = new ArrayList<>();
    }

    public Personen(List<Persoon> personen) {
        List<Persoon> kopie = new ArrayList<>(personen);
        this.personen = kopie;
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

    /*
     * De kopie wordt gemaakt in de tweede constructor!
     */
    public Personen maakKopie() {
       return new Personen(personen);
    }
}
