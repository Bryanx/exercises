package be.kdg.programmeertalen.model;

import be.kdg.programmeertalen.reflection.CanRun;

import java.time.LocalDate;

/**
 * @author Bryan de Ridder
 * @version 1.0 04/10/17 14:24
 */
public class Taal implements Comparable<Taal> {
    private String naam;
    private int aantalGebruikers;
    private LocalDate opgerichtIn;

    public Taal() {
        this("Onbekend", 0, LocalDate.of(1910, 1, 1));
    }

    public Taal(String naam, int aantalGebruikers, LocalDate opgerichtIn) {
        setNaam(naam);
        setOpgerichtIn(opgerichtIn);
        setAantalGebruikers(aantalGebruikers);
    }

    public void setAantalGebruikers(int aantal) {
        if (aantal < 0) throw new IllegalArgumentException("Aantal gebruikers mag niet onder 0 liggen.");
        this.aantalGebruikers = aantal;
    }

    public void setOpgerichtIn(LocalDate datum) {
        if (datum.isAfter(LocalDate.now()) || datum.isBefore(LocalDate.of(1900, 1, 1))) {
            throw new IllegalArgumentException("Ongeldige oprichtings datum.");
        } else {
            this.opgerichtIn = datum;
        }
    }

    @CanRun
    public void setNaam(String naam) {
        if (naam == null || naam.length() == 0) throw new IllegalArgumentException("Ongeldige naam.");
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalGebruikers() {
        return aantalGebruikers;
    }

    public LocalDate getOpgerichtIn() {
        return opgerichtIn;
    }

    @Override
    public int compareTo(Taal o) {
        return this.naam.compareTo(o.naam);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Taal that = (Taal) o;

        return naam.equals(that.naam);

    }

    @Override
    public int hashCode() {
        return naam.hashCode();
    }

    @Override
    public String toString() {
        return naam + " " + this.aantalGebruikers + " " + this.opgerichtIn;
    }
}
