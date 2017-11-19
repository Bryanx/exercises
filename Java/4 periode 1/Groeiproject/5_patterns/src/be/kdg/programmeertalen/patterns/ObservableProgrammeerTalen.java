package be.kdg.programmeertalen.patterns;

import be.kdg.programmeertalen.model.ProgrammeerTaal;
import be.kdg.programmeertalen.model.ProgrammeerTalen;
import be.kdg.programmeertalen.model.ProgrammeerTalenSet;

import java.util.List;
import java.util.Observable;

/**
 * @author Bryan de Ridder
 * @version 1.0 18/10/17 15:44
 */
public class ObservableProgrammeerTalen extends Observable implements ProgrammeerTalen {

    private ProgrammeerTalenSet talen;

    public ObservableProgrammeerTalen() {
        this.talen = new ProgrammeerTalenSet();
    }

    @Override
    public boolean voegToe(ProgrammeerTaal taal) {
        boolean isVeranderd = talen.voegToe(taal);
        if (isVeranderd) {
            setChanged();
            notifyObservers("Observer meldt: Toegevoegd: " + taal);
            return true;
        }
        return false;
    }

    @Override
    public boolean verwijder(String naam) {
        ProgrammeerTaal temp = talen.zoek(naam);
        boolean isVeranderd = talen.verwijder(naam);
        if (isVeranderd) {
            setChanged();
            notifyObservers("Observer meldt: Verwijderd: " + temp);
            return true;
        }
        return false;
    }

    @Override
    public ProgrammeerTaal zoek(String naam) {
        return talen.zoek(naam);
    }

    @Override
    public List<ProgrammeerTaal> gesorteerdOpNaam() {
        return talen.gesorteerdOpNaam();
    }

    @Override
    public List<ProgrammeerTaal> gesorteerdOpAantalGebruikers() {
        return talen.gesorteerdOpAantalGebruikers();
    }

    @Override
    public List<ProgrammeerTaal> gesorteerdOpOprichtingsDatum() {
        return talen.gesorteerdOpOprichtingsDatum();
    }

    @Override
    public int getAantal() {
        return talen.getAantal();
    }
}
