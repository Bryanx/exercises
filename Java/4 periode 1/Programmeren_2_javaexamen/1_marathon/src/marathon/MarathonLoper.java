package marathon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/** Examen Programmeren 2 - Java
 * Januari 2017
 * IN DEZE KLASSE MAG JE NIETS WIJZIGEN!
 */
public class MarathonLoper {
    private String naam;
    private String herkomst;
    private LocalDate wedstrijdDatum;
    private int seconden;

    public MarathonLoper(String naam, String herkomst, LocalDate wedstrijdDatum, int seconden) {
        this.naam = naam;
        this.herkomst = herkomst;
        this.wedstrijdDatum = wedstrijdDatum;
        this.seconden = seconden;
    }

    public String getNaam() {
        return naam;
    }

    public String getHerkomst() {
        return herkomst;
    }

    public LocalDate getWedstrijdDatum() {
        return wedstrijdDatum;
    }

    public int getSeconden() {
        return seconden;
    }

    public String getTimeString() {
        int u = seconden / 3600;
        int m = (seconden % 3600) / 60;
        int s = (seconden % 3600) % 60;
        return String.format("%02d:%02d:%02d", u, m, s);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-20s %-16s gelopen op %-10s --> %s",
                naam, herkomst, formatter.format(wedstrijdDatum), getTimeString());
    }
}
