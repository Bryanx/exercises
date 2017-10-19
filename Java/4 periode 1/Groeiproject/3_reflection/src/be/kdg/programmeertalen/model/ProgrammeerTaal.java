package be.kdg.programmeertalen.model;

import be.kdg.programmeertalen.reflection.CanRun;

import java.time.LocalDate;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/09/17 17:05
 */
public class ProgrammeerTaal extends Taal {
    private String oprichter;
    private String extensionName;
    private double laatsteVersie;
    private Stijl stijl;

    public ProgrammeerTaal() {
        super("Onbekend", 0, LocalDate.of(1901, 1, 1));
        setOprichter("Onbekend");
        setExtensionName(".");
        setLaatsteVersie(0);
        setStijl(Stijl.GEEN);
    }

    public ProgrammeerTaal(String naam, String oprichter, String extensionName,
                           double laatsteVersie, int aantalGebruikers, Stijl stijl, LocalDate opgerichtIn) {
        super(naam, aantalGebruikers, opgerichtIn);
        setOprichter(oprichter);
        setExtensionName(extensionName);
        setLaatsteVersie(laatsteVersie);
        setStijl(stijl);
    }

    public void setOprichter(String oprichter) {
        if (oprichter == null || oprichter.length() == 0) {
            throw new IllegalArgumentException("Oprichter naam ongeldig.");
        }
        this.oprichter = oprichter;
    }

    public void setExtensionName(String extension) {
        if (extension.length() == 0) throw new IllegalArgumentException("Extensie is ongeldig.");
        if (extension.charAt(0) != '.') throw new IllegalArgumentException("Extensie moet beginnen met een punt.");
        this.extensionName = extension;

    }

    public void setLaatsteVersie(double versie) {
        if (versie < 0 || versie > 1000) throw new IllegalArgumentException("Versie is ongeldig.");
        this.laatsteVersie = versie;
    }

    public void setStijl(Stijl stijl) {
        this.stijl = stijl;
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

    public Stijl getStijl() {
        return stijl;
    }

    @Override
    public String toString() {
        return String.format("(°%s) %-15s %-20s %7d %-15s Opgerichter: %-20s Versie: %-10.2f %6s",
                super.getOpgerichtIn().getYear(),
                getNaam(),
                this.stijl,
                getAantalGebruikers(),
                "gebruikers",
                this.oprichter,
                this.laatsteVersie,
                this.extensionName
        );
    }
}


