
public class Berghut implements Comparable<Berghut>{
    private String naam;
    private int hoogte;
    private String locatie;

    public Berghut(String naam, int hoogte, String locatie) {
        this.naam = naam;
        this.hoogte = hoogte;
        this.locatie = locatie;
    }

    public String getNaam() {
        return naam;
    }

    public int getHoogte() {
        return hoogte;
    }

    public String getLocatie() {
        return locatie;
    }

    @Override
    public String toString() {
        return String.format("%-20s (%4dm) gelegen in %s", naam, hoogte, locatie);
    }

    @Override
    public int compareTo(Berghut o) {
        return this.naam.compareTo(o.naam);
    }
}
