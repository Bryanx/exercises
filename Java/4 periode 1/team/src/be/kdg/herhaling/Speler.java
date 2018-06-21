package be.kdg.herhaling;

public class Speler implements Comparable<Speler> {
    private int rugNummer;
    private String naam;
    private Adres adres;

    // TODO 2.1 Maak beide constructors + een getter voor het rugNummer

    public Speler(int rugNummer, String naam, Adres adres) {
        this.rugNummer = rugNummer;
        this.naam = naam;
        this.adres = adres;
    }

    public Speler(int rugNummer, String naam, String straat, int postNummer, String gemeente) {
        this.rugNummer = rugNummer;
        this.naam = naam;
        adres = new Adres(straat,postNummer,gemeente);
    }

    public int getRugNummer() {
        return rugNummer;
    }

    //TODO  2.2 Override de toString methode (zie gewenste uitvoer - werk met kolommen)

    @Override
    public String toString() {
        return String.format("%-2d %-20s %s",rugNummer, naam, adres.toString());
    }

    //TODO  2.3 Implementeer de Comparable interface, zodat spelers gesorteerd kunnen
	// worden op naam
    @Override
    public int compareTo(Speler o) {
        return naam.compareTo(o.naam);
    }

}
