package be.kdg.data;

import java.util.*;

/**
 * @author Kristiaan Behiels
 * @version 1.0 3/10/2015 22:38
 */
public class Artikels {
     final private Map<Integer, Artikel> artikels = new HashMap<>();

     public Artikels() {
        artikels.put(2, new Artikel(2, "Asus", "R556LA-XX1116H", 399));
        artikels.put(6, new Artikel(6, "HP", "Pavilion 15-p268nb", 649));
        artikels.put(7, new Artikel(7, "Asus", "EeeBook X205TA", 239));
        artikels.put(1, new Artikel(1, "Lenovo", "IdeaPad G50-80", 549));
        artikels.put(3, new Artikel(3, "Lenovo", "IdeaPad Z70-80", 499));
        artikels.put(10, new Artikel(10, "Asus", "K555LJ-DM706T", 849));
        artikels.put(9, new Artikel(9, "Lenovo", "IdeaPad S21e-20", 199));
        artikels.put(5, new Artikel(5, "MSI", "GP72Qe-016BE", 1199));
        artikels.put(4, new Artikel(4, "Toshiba", "Satelite Pro R50-B-109", 399));
        artikels.put(8, new Artikel(8, "Toshiba", "Satelite L50D-B-1CE", 649));
    }

     public Map<Integer, Artikel> getArtikels() {
        return new HashMap<>(artikels);
    }
}
