package be.kdg.menu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Bryan de Ridder
 * @version 1.0 13/12/2016 14:33
 */
public class Student implements Comparable<Student> {
    private String naam;
    private LocalDate geboorteDatum;
    private String woonplaats;
    private int postcode;
    private String eMail;

    public Student(String naam, LocalDate geboorteDatum, String woonPlaats, String eMail) {
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
        this.woonplaats = woonPlaats;
        this.eMail = eMail;
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public String geteMail() {
        return eMail;
    }

    @Override
    public String toString() {
        return String.format("%-30s %-15s %-30s %s",
                this.naam,
                this.geboorteDatum.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                this.woonplaats,
                this.eMail);
    }

    @Override
    public int compareTo(Student other) {
        return naam.compareTo(other.naam);
    }
}
