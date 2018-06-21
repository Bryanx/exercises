package be.kdg.craps.model.craps;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 27/10/17 13:57
 */
public class Gebruikers {
    private static Gebruikers ourInstance = new Gebruikers();
    private static List<Gebruiker> list = new ArrayList<>();

    private Gebruikers() { }

    public boolean login(String naam, String wachtwoord) {
        for (Gebruiker gebruiker : list) {
            if (gebruiker.getNaam().equals(naam) &&
                    gebruiker.getWachtwoord().equals(wachtwoord)) {
                return true;
            }
        }
        return false;
    }

    public static Gebruikers getInstance() {
        if (list.size() <= 0) list.add(new Gebruiker("bla","bla"));
        return ourInstance;
    }

}
