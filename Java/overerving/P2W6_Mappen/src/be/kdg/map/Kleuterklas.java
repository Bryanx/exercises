package be.kdg.map;

import java.util.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 15:44
 */
public class Kleuterklas {
    private Map<String, Kind> kinderen;
    private String naam;

    public Kleuterklas(String naam) {
        this.naam = naam;
        this.kinderen = new HashMap<>();
    }

    public void schrijfKindIn(Kind k) {
        kinderen.put(k.getNaam(), k);
    }

    public Kind zoekKind(String naam) {
        return kinderen.get(naam);
    }

    public void toonKind(String naam) {
        if (kinderen.containsKey(naam)) {
            System.out.println(kinderen.get(naam));
        } else {
            System.out.println("Zit niet in de klas!");
        }
    }

    public void toonGemiddeldeLeeftijd() {
        double som = 0;
        for (Kind k : kinderen.values()) {
            som += k.getLeeftijd();
        }
        System.out.println(som /kinderen.size());
    }

    public void toonKinderenGroterDanEenMeter() {
        for (Kind kind: kinderen.values()) {
            if (kind.getLengte() > 1)
                System.out.println(kind);
        }
    }

    @Override
    public String toString() {
        String string = "Klas: " + naam + "\n";
        for (Kind k : kinderen.values()) {
            string += k;
        }
        return string;
    }
}
