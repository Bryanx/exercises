package staticfactory;

public interface RijksregisterNummer {
    public static final RijksregisterNummer FOUTIEF_NUMMER = RijksregisterNummerFactory.newNummer("00.00.00 000-00");

    String toString();

    long toLong();
}

