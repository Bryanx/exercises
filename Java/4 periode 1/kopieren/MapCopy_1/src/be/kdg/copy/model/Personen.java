package be.kdg.copy.model;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Todo 1: Werk de nodige methoden verder uit.
 */
public class Personen {
    private Map<String, Persoon> personen;

    public Personen() {
        personen = new TreeMap<>();
    }

    // key is de naam, value is het persoon object
    public void voegPersoonToe(Persoon persoon) {
        personen.put(persoon.getNaam(), persoon);
    }

    public String maakPersonenString() {
        StringBuilder sb = new StringBuilder();
        for (Persoon persoon : personen.values()) {
            sb.append(persoon + "\n");
        }
        return sb.toString();
    }

    public Personen maakKopie() {
        Personen kopie = new Personen();
        kopie.personen.putAll(personen);
        return kopie;
    }


	// TODO 2: Uitdaging! Toon gesorteerd volgens naam
	public String maakGesorteerdString() {
		return "";
	}
}
