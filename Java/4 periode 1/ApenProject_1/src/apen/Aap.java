package apen;

import java.time.LocalDate;
import java.time.Period;

/**
 * De klasse Aap bevat alle eigenschappen van een aap die in de Antwerpse Zoo leeft.
 * Aap is Comparable op naam. Er zijn getters en setters voorzien.
 * Je moet hier in principe niets wijzigen!
 */
public class Aap implements Comparable<Aap> {
    private String naam;
    private String soort;
    private String familie;
    private Geslacht geslacht;
    private LocalDate geboorte;
    private double gewicht;
    private String kooi;

    public Aap(String naam, String soort, String familie, Geslacht geslacht, LocalDate geboorte, double gewicht, String kooi) {
        this.naam = naam;
        this.soort = soort;
        this.familie = familie;
        this.geslacht = geslacht;
        this.geboorte = geboorte;
        this.gewicht = gewicht;
        this.kooi = kooi;
    }

    public Aap() {

    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public void setFamilie(String familie) {
        this.familie = familie;
    }

    public void setGeslacht(Geslacht geslacht) {
        this.geslacht = geslacht;
    }

    public void setGeboorte(LocalDate geboorte) {
        this.geboorte = geboorte;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setKooi(String kooi) {
        this.kooi = kooi;
    }

    public String getNaam() {
        return naam;
    }

    public String getSoort() {
        return soort;
    }

    public String getFamilie() {
        return familie;
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }

    public LocalDate getGeboorte() {
        return geboorte;
    }

    public double getGewicht() {
        return gewicht;
    }

    public String getKooi() {
        return kooi;
    }

    public long getLeeftijd() {
        LocalDate vandaag = LocalDate.now();
        return Period.between(geboorte, vandaag).getYears();
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-17s %c   geboren: %4d %7.1f kg   kooi: %s",
                naam, soort, familie, geslacht.name().charAt(0),
                geboorte.getYear(), gewicht, kooi);
    }

    @Override
    public int compareTo(Aap other) {
        return naam.compareTo(other.naam);
    }
}
