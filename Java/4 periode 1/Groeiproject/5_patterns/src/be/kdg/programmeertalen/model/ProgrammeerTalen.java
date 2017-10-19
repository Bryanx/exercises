package be.kdg.programmeertalen.model;

import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 18/10/17 15:42
 */
public interface ProgrammeerTalen {
    boolean voegToe(ProgrammeerTaal taal);

    boolean verwijder(String naam);

    ProgrammeerTaal zoek(String naam);

    List<ProgrammeerTaal> gesorteerdOpNaam();

    List<ProgrammeerTaal> gesorteerdOpAantalGebruikers();

    List<ProgrammeerTaal> gesorteerdOpOprichtingsDatum();

    int getAantal();
}
