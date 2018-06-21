package be.kdg.programmeertalen.model;

import java.time.LocalDate;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/09/17 17:05
 */
public final class ProgrammeerTaal implements Comparable<ProgrammeerTaal> {

    public static final LocalDate MIN_DATE = LocalDate.of(1900, 1, 1);
    public static final double MAX_VERSION_NR = 1000.0;
    private final String naam;
    private final String oprichter;
    private final String extensionName;
    private final double laatsteVersie;
    private final int aantalGebruikers;
    private final Stijl stijl;
    private final LocalDate opgerichtIn;

    public ProgrammeerTaal() {
        this("Onbekend", "Onbekend", ".", 0.0, 0, Stijl.GEEN, MIN_DATE);
    }

    public ProgrammeerTaal(String naam, String oprichter, String extensionName,
                           double laatsteVersie, int aantalGebruikers, Stijl stijl, LocalDate opgerichtIn) {
        this.naam = naam;
        this.oprichter = oprichter;
        this.extensionName = extensionName;
        this.laatsteVersie = laatsteVersie;
        this.aantalGebruikers = aantalGebruikers;
        this.stijl = stijl;
        this.opgerichtIn = opgerichtIn;
    }

    public String getNaam() {
        return naam;
    }

    public String getOprichter() {
        return oprichter;
    }

    public String getExtensionName() {
        return extensionName;
    }

    public double getLaatsteVersie() {
        return laatsteVersie;
    }

    public int getAantalGebruikers() {
        return aantalGebruikers;
    }

    public Stijl getStijl() {
        return stijl;
    }

    public LocalDate getOpgerichtIn() {
        return opgerichtIn;
    }

    @Override
    public int compareTo(ProgrammeerTaal o) {
        return this.naam.compareTo(o.naam);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProgrammeerTaal that = (ProgrammeerTaal) o;

        return naam.equals(that.naam);

    }

    @Override
    public int hashCode() {
        return naam.hashCode();
    }

    @Override
    public String toString() {
        return String.format("(°%s) %-15s %-20s %7d\t%-15s Oprichter: %-22s Versie: %-10.2f %-6s",
                this.opgerichtIn.getYear(),
                this.naam,
                this.stijl,
                this.aantalGebruikers,
                "gebruikers",
                this.oprichter,
                this.laatsteVersie,
                this.extensionName
        );
    }
}


