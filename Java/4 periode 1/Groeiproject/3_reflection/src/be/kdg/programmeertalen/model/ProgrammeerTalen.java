package be.kdg.programmeertalen.model;

import java.util.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/09/17 17:05
 */
public class ProgrammeerTalen {
    private TreeSet<Taal> talen;

    public ProgrammeerTalen() {
        this.talen = new TreeSet<>();
    }

    public boolean voegToe(Taal taal) {
        try {
            talen.add(taal);
        } catch (Exception iae) {
            System.err.println("Ongeldig bestand toegevoegd.");
            return false;
        }
        return true;
    }

    public boolean verwijder(String naam) {
        for (Taal taal : talen) {
            if (taal.getNaam().equals(naam)) {
                talen.remove(taal);
                return true;
            }
        }
        return false;
    }

    public Taal zoek(String naam) {
        for (Taal taal : talen) {
            if (taal.getNaam().equals(naam)) {
                return taal;
            }
        }
        return null;
    }

    public List<Taal> gesorteerdOpNaam() {
        List<Taal> list = new ArrayList<>(talen.size());
        list.addAll(talen);
        Collections.sort(list);
        return list;
    }

    public List<Taal> gesorteerdOpAantalGebruikers() {
        List<Taal> list = new ArrayList<>(talen.size());
        list.addAll(talen);

        Collections.sort(list, (o1, o2) -> o2.getAantalGebruikers() - o1.getAantalGebruikers());

        return list;
    }

    public List<Taal> gesorteerdOpOprichtingsDatum() {
        List<Taal> list = new ArrayList<>(talen.size());
        list.addAll(talen);
        Collections.sort(list, new Comparator<Taal>() {
            @Override
            public int compare(Taal o1, Taal o2) {
                if (o1.getOpgerichtIn().isBefore(o2.getOpgerichtIn())) {
                    return -1;
                } else if (o1.getOpgerichtIn().isAfter(o2.getOpgerichtIn())) {
                    return 1;
                }
                return 0;
            }
        });
        return list;
    }

    public int getAantal() {
        return talen.size();
    }
}
