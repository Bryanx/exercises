package be.kdg.programmeertalen.patterns;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTalen;
import be.kdg.programmeertalen.model.ProgrammeerTalenSet;

import java.util.Collections;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 25/10/17 16:28
 */
public class UnmodifiableProgrammeerTalen implements ProgrammeerTalen {

    private ProgrammeerTalenSet talen;

    public UnmodifiableProgrammeerTalen(ProgrammeerTalenSet talen) {
        this.talen = talen;
    }

    @Override
    public boolean voegToe(ProgrammeerTaal taal) {
        throw new UnsupportedOperationException("Dit mag niet.");
    }

    @Override
    public boolean verwijder(String naam) {
        throw new UnsupportedOperationException("Dit mag niet.");
    }

    @Override
    public ProgrammeerTaal zoek(String naam) {
        return null;
    }

    @Override
    public List gesorteerdOpNaam() {
        return Collections.unmodifiableList(talen.gesorteerdOpNaam());
    }

    @Override
    public List<ProgrammeerTaal> gesorteerdOpAantalGebruikers() {
        return Collections.unmodifiableList(talen.gesorteerdOpAantalGebruikers());
    }

    @Override
    public List<ProgrammeerTaal> gesorteerdOpOprichtingsDatum() {
        return Collections.unmodifiableList(talen.gesorteerdOpOprichtingsDatum());
    }

    @Override
    public int getAantal() {
        return talen.getAantal();
    }
}
