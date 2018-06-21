package staticfactory;

public class PersoonFactory {

    private PersoonFactory() {
        // empty
    }

    static public Persoon newPersoon(String naam, String nummer) {
        return new PersoonImpl(naam, nummer);
    }

    static public Persoon newPersoon(String naam, RijksregisterNummer nummer) {
        return new PersoonImpl(naam, nummer);
    }

    static public Persoon newPersoon(String naam) {
        return new PersoonImpl(naam, RijksregisterNummer.FOUTIEF_NUMMER);
    }
}
