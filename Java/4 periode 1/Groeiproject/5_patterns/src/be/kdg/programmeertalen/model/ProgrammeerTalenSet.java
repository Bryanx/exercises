package be.kdg.programmeertalen.model;

import java.util.*;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/09/17 17:05
 */
public class ProgrammeerTalenSet implements ProgrammeerTalen {
    private TreeSet<ProgrammeerTaal> talen;

    public ProgrammeerTalenSet() {
        this.talen = new TreeSet<>();
    }

    @Override
    public boolean voegToe(ProgrammeerTaal taal) {
        return talen.add(taal);
    }

    @Override
    public boolean verwijder(String naam) {
        for (ProgrammeerTaal programmeerTaal : talen) {
            if (programmeerTaal.getNaam().equals(naam)) {
                talen.remove(programmeerTaal);
                return true;
            }
        }
        return false;
    }

    @Override
    public ProgrammeerTaal zoek(String naam) {
        for (ProgrammeerTaal programmeerTaal : talen) {
            if (programmeerTaal.getNaam().equals(naam)) {
                return programmeerTaal;
            }
        }
        return null;
    }

    @Override
    public List<ProgrammeerTaal> gesorteerdOpNaam() {
        List<ProgrammeerTaal> list = new ArrayList<>(talen.size());
        list.addAll(talen);
        Collections.sort(list);
        return list;
    }

    @Override
    public List<ProgrammeerTaal> gesorteerdOpAantalGebruikers() {
        List<ProgrammeerTaal> list = new ArrayList<>(talen.size());
        list.addAll(talen);

        Collections.sort(list, (o1, o2) -> o2.getAantalGebruikers() - o1.getAantalGebruikers());

        return list;
    }

    @Override
    public List<ProgrammeerTaal> gesorteerdOpOprichtingsDatum() {
        List<ProgrammeerTaal> list = new ArrayList<>(talen.size());
        list.addAll(talen);
        Collections.sort(list, new Comparator<ProgrammeerTaal>() {
            @Override
            public int compare(ProgrammeerTaal o1, ProgrammeerTaal o2) {
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

    @Override
    public int getAantal() {
        return talen.size();
    }
}
