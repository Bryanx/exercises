package serializabledemo;

import java.io.Serializable;

public class Persoon implements Serializable { //Let op de interface
    private String naam;
    private String adres;
    private long rijksRegisterNummer;
    private transient double loon; //OPGELET: transient dus wordt niet geserializeerd!

    public Persoon(String naam, String adres, long rijksRegisterNummer, double loon) {
        this.naam = naam;
        this.adres = adres;
        this.rijksRegisterNummer = rijksRegisterNummer;
        this.loon = loon;
    }

    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }

    public long getRijksRegisterNummer() {
        return rijksRegisterNummer;
    }

    public double getLoon() {
        return loon;
    }
}
