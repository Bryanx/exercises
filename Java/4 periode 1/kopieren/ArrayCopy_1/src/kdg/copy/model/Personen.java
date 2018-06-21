package kdg.copy.model;

import java.util.Arrays;

/**
 * Werk de nodige methoden verder uit.
 */
public class Personen {
    private static final int MAX_PERSONEN = 10;

    private final Persoon[] personen;
    private int aantal;

    private Personen(Persoon[] personen, int aantal) {
        this.personen = personen;
        this.aantal = aantal;
    }

    public Personen() {
        personen = new Persoon[MAX_PERSONEN];
    }

    public void voegPersoonToe(Persoon persoon) {
        if (aantal <= MAX_PERSONEN) {
            personen[aantal] = persoon;
            aantal++;
        }

    }

    public String maakPersonenString() {
        StringBuilder sb = new StringBuilder();
        for (Persoon persoon : personen) {
            if (persoon != null)
            sb.append(persoon.toString() + "\n");
        }
       return sb.toString();
    }

    /*
     * TODO 1. Maak hierin gebruik van de methode System.arraycopy
     * om een kopie van de tabel te maken
     * en test.
     */
    public Personen maakKopie() {
        Persoon[] kopie = new Persoon[MAX_PERSONEN];
        System.arraycopy(personen,0,kopie,0,aantal);
        return new Personen(kopie, aantal);
    }

	/*
* TODO 2 Als de test met TODO 1 geslaagd is, implementeer dan maakKopie2
* Maak hier gebruik van de methode  Arrays.copyOf  (sinds Java 6)
* Zie Javadoc
*/
	public Personen maakKopie2() {
        Persoon[] kopie = Arrays.copyOf(personen, aantal);
        return new Personen(kopie, MAX_PERSONEN);
	}
}
