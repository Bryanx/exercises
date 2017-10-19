package be.kdg.programmeertalen.model;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    static final Logger LOGGER = Logger.getLogger(ProgrammeerTaal.class.getName());

    public ProgrammeerTaal() {
        setNaam("Onbekend");
        setOprichter("Onbekend");
        setExtensionName(".");
        setLaatsteVersie(0);
        setAantalGebruikers(0);
        setStijl(Stijl.GEEN);
        setOpgerichtIn(LocalDate.of(1901, 1, 1));
    }

    public ProgrammeerTaal(String naam, String oprichter, String extensionName,
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
            LOGGER.log(Level.SEVERE, "Oprichter naam mag niet leeg zijn.", this.getClass().getSimpleName());
//            throw new IllegalArgumentException("Oprichter naam mag niet leeg zijn.");
        }
        this.oprichter = oprichter;
    }

    public void setExtensionName(String extension) {
        if (extension.isEmpty()) {
            String error = String.format("Extensie mag niet leeg zijn " +
                    "voor programmeertaal %s.", this.getNaam());
            LOGGER.log(Level.SEVERE, error, this.getClass().getSimpleName());
//            throw new IllegalArgumentException(error);
        } else if (extension.charAt(0) != '.') {
            String error = String.format("Extensie %s moet beginnen met een punt " +
                    "voor programmeertaal %s.", extension, this.getNaam());
            LOGGER.log(Level.SEVERE, error, this.getClass().getSimpleName());
//            throw new IllegalArgumentException(error);
        }
        this.extensionName = extension;

    }

    //TODO: Voorkom dat throw het programma crasht, hoe?: try catch, maar waar?
    public void setLaatsteVersie(double versie) throws IllegalArgumentException {
        if (versie < 0 || versie > 1000) {
            String error = String.format("Versie %.2f mag niet negatief zijn of groter dan 1000 " +
                    "voor programmeertaal %s.", versie, this.getNaam());
            LOGGER.log(Level.SEVERE, error, this.getClass().getSimpleName());
//            throw new IllegalArgumentException(error);
        }
        this.laatsteVersie = versie;
    }

    public void setAantalGebruikers(int aantal) {
        if (aantal < 0) {
            String error = String.format("Aantal gebruikers mag niet onder de 0 liggen " +
                    "voor programmeertaal %s.", this.getNaam());
            LOGGER.log(Level.SEVERE, error, this.getClass().getSimpleName());
//            throw new IllegalArgumentException(error);
        }
        this.aantalGebruikers = aantal;
    }

    public void setStijl(Stijl stijl) {
        this.stijl = stijl;
    }

    public void setOpgerichtIn(LocalDate datum) {
        if (datum.isAfter(LocalDate.now()) || datum.isBefore(LocalDate.of(1900, 1, 1))) {
            String error = String.format("%s : Ongeldige oprichtings datum.", datum);
            LOGGER.log(Level.SEVERE, error, this.getClass().getSimpleName());
//            throw new IllegalArgumentException(error);
        } else {
            this.opgerichtIn = datum;
        }
    }

    public void setNaam(String naam) {
        if (naam.isEmpty()) {
            LOGGER.log(Level.SEVERE, "Naam mag niet leeg zijn.", this.getClass().getSimpleName());
//            throw new IllegalArgumentException("Naam mag niet leeg zijn.");
        }
        this.naam = naam;
    }

    public String getNaam() {
        if (naam.isEmpty()) return "Onbekend";
        return naam;
    }

    public String getOprichter() {
        if (oprichter.isEmpty()) return "Onbekend";
        return oprichter;
    }

    public String getExtensionName() {
        if (extensionName.isEmpty()) return ".";
        return extensionName;
    }

    public double getLaatsteVersie() {
        if (laatsteVersie < 0) return 0.0;
        return laatsteVersie;
    }

    public int getAantalGebruikers() {
        if (aantalGebruikers < 0) return 0;
        return aantalGebruikers;
    }

    public Stijl getStijl() {
        if (stijl == null) return Stijl.GEEN;
        return stijl;
    }

    public LocalDate getOpgerichtIn() {
        if (opgerichtIn == null) return LocalDate.of(1901, 1, 1);
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
        return String.format("(°%s) %-15s %-20s %7d %-15s Opgerichter: %-20s Versie: %-10.2f %6s",
                this.getOpgerichtIn() == null ? this.getOpgerichtIn().getYear() : 0,
                this.getNaam(),
                this.getStijl(),
                this.getAantalGebruikers(),
                "gebruikers",
                this.getOprichter(),
                this.getLaatsteVersie(),
                this.getExtensionName()
        );
    }
}


