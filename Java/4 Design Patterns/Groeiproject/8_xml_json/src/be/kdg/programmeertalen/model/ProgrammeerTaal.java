package be.kdg.programmeertalen.model;

import be.kdg.programmeertalen.parsing.LocalDateAdapter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/09/17 17:05
 */
@XmlType(propOrder = {"naam", "oprichter", "extensionName", "laatsteVersie","aantalGebruikers","stijl","opgerichtIn"})
public class ProgrammeerTaal implements Comparable<ProgrammeerTaal> {

    public static final LocalDate MIN_DATE = LocalDate.of(1900, 1, 1);
    public static final double MAX_VERSION_NR = 1000.0;
    private String naam;
    private String oprichter;
    private String extensionName;
    private double laatsteVersie;
    private int aantalGebruikers;
    private Stijl stijl;
    private LocalDate opgerichtIn;

    public ProgrammeerTaal() {
        setNaam("Onbekend");
        setOprichter("Onbekend");
        setExtensionName(".");
        setLaatsteVersie(0.0);
        setAantalGebruikers(0);
        setStijl(Stijl.GEEN);
        setOpgerichtIn(MIN_DATE);
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
        if (oprichter.isEmpty()) throw new IllegalArgumentException("Oprichter naam ongeldig.");
        this.oprichter = oprichter;
    }

    @XmlAttribute(name = "extension-name")
    public void setExtensionName(String extension) {
        if (extension.isEmpty()) throw new IllegalArgumentException("Extensie is ongeldig.");
        if (extension.charAt(0) != '.') throw new IllegalArgumentException("Extensie moet beginnen met een punt.");
        this.extensionName = extension;

    }

    @XmlElement(name = "laatste-versie")
    public void setLaatsteVersie(double versie) {
        if (versie < 0.0 || versie > MAX_VERSION_NR) throw new IllegalArgumentException("Versie is ongeldig.");
        this.laatsteVersie = versie;
    }

    @XmlElement(name = "aantal-gebruikers")
    public void setAantalGebruikers(int aantal) {
        if (aantal < 0) throw new IllegalArgumentException("Aantal gebruikers mag niet onder 0 liggen.");
        this.aantalGebruikers = aantal;
    }

    public void setStijl(Stijl stijl) {
        this.stijl = stijl;
    }

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    @XmlElement(name = "opgericht-in")
    public void setOpgerichtIn(LocalDate datum) {
        if (datum.isAfter(LocalDate.now()) || datum.isBefore(MIN_DATE))
            throw new IllegalArgumentException("Ongeldige oprichtings datum.");
        this.opgerichtIn = datum;
    }

    public void setNaam(String naam) {
        if (naam.isEmpty()) throw new IllegalArgumentException("Ongeldige naam.");
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


