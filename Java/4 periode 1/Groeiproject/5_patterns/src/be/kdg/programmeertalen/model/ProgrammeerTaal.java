package be.kdg.programmeertalen.model;

import java.time.LocalDate;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/09/17 17:05
 */
public class ProgrammeerTaal implements Comparable<ProgrammeerTaal> {

    private String naam;
    private String oprichter;
    private String extensionName;
    private double laatsteVersie;
    private int aantalGebruikers;
    private Stijl stijl;
    private LocalDate opgerichtIn;

    ProgrammeerTaal() {
        setNaam("Onbekend");
        setOprichter("Onbekend");
        setExtensionName(".");
        setLaatsteVersie(0);
        setAantalGebruikers(0);
        setStijl(Stijl.GEEN);
        setOpgerichtIn(LocalDate.of(1901, 1, 1));
    }

    ProgrammeerTaal(String naam, String oprichter, String extensionName,
                           double laatsteVersie, int aantalGebruikers, Stijl stijl, LocalDate opgerichtIn) {
        setNaam(naam);
        setOprichter(oprichter);
        setExtensionName(extensionName);
        setLaatsteVersie(laatsteVersie);
        setAantalGebruikers(aantalGebruikers);
        setStijl(stijl);
        setOpgerichtIn(opgerichtIn);
    }

    public void setOprichter(String oprichter) {
        if (oprichter.isEmpty()) {
            throw new IllegalArgumentException("Oprichter naam ongeldig.");
        }
        this.oprichter = oprichter;
    }

    public void setExtensionName(String extension) {
        if (extension.isEmpty()) throw new IllegalArgumentException("Extensie is ongeldig.");
        if (extension.charAt(0) != '.') throw new IllegalArgumentException("Extensie moet beginnen met een punt.");
        this.extensionName = extension;

    }

    public void setLaatsteVersie(double versie) {
        if (versie < 0.0 || versie > 1000.0) throw new IllegalArgumentException("Versie is ongeldig: " + versie);
        this.laatsteVersie = versie;
    }

    public void setAantalGebruikers(int aantal) {
        if (aantal < 0) throw new IllegalArgumentException("Aantal gebruikers mag niet onder 0 liggen.");
        this.aantalGebruikers = aantal;
    }

    public void setStijl(Stijl stijl) {
        this.stijl = stijl;
    }

    public void setOpgerichtIn(LocalDate datum) {
        if (datum.isAfter(LocalDate.now()) || datum.isBefore(LocalDate.of(1900, 1, 1))) {
            throw new IllegalArgumentException("Ongeldige oprichtings datum.");
        } else {
            this.opgerichtIn = datum;
        }
    }

    public void setNaam(String naam) {
        if (naam.isEmpty()) throw new IllegalArgumentException("Ongeldige naam: "+naam);
        this.naam = naam;
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


