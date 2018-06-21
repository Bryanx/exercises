package staticfactory;

public class PersoonImpl implements Persoon {
    private String naam;
    private RijksregisterNummer nummer;

    public PersoonImpl(String naam, RijksregisterNummer nummer) {
        this.naam = naam;
        this.nummer = nummer;
    }

    public PersoonImpl(String naam, String nummer) {
        this(naam, RijksregisterNummerFactory.newNummer(nummer));
    }

    public String naam() {
        return naam;
    }

    public RijksregisterNummer nummer() {
        return nummer;
    }

    public String toString() {
        return naam + " " + nummer;
    }
}
