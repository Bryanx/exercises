package model;

import java.beans.Transient;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Student {
    private final int studNr; //komt binnen via constructor; nadien niet meer wijzigbaar
    private String naam;
    private LocalDate geboorteDatum;

    public Student(int studNr, String naam, LocalDate geboorteDatum) {
        this.studNr = studNr;
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
    }

    public Student() {
        this(0, "Dummy", LocalDate.now());
    }

    //getters en setters
    public int getStudNr() {
        return studNr;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    @Override
    public String toString() {
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        return String.format("%s (°%s) studNr: %d", naam, shortFormatter.format(geboorteDatum), studNr);
    }
}
