package be.kdg.herhaling;

public class Adres {
    private String straat;
    private int postNummer;
    private String gemeente;

    // TODO 1.1 Maak de constructor + getters


    public Adres(String straat, int postNummer, String gemeente) {
        this.straat = straat;
        this.postNummer = postNummer;
        this.gemeente = gemeente;
    }

    public String getStraat() {
        return straat;
    }

    public int getPostNummer() {
        return postNummer;
    }

    public String getGemeente() {
        return gemeente;
    }

    // TODO 1.2 Override de toString methode
    @Override
    public String toString() {
        return String.format("%-20s %d %s", straat, postNummer, gemeente);
    }
}
