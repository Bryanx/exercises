package be.kdg.data;

import java.util.*;

public class Artikels {
    final static private List<Artikel> artikels = Arrays.asList(
            new Artikel(2, "Asus", "R556LA-XX1116H", 399),
            new Artikel(6, "HP", "Pavilion 15-p268nb", 649),
            new Artikel(7, "Asus", "EeeBook X205TA", 239),
            new Artikel(1, "Lenovo", "IdeaPad G50-80", 549),
            new Artikel(3, "Lenovo", "IdeaPad Z70-80", 499),
            new Artikel(10, "Asus", "K555LJ-DM706T", 849),
            new Artikel(9, "Lenovo", "IdeaPad S21e-20", 199),
            new Artikel(5, "MSI", "GP72Qe-016BE", 1199),
            new Artikel(4, "Toshiba", "Satelite Pro R50-B-109", 399),
            new Artikel(8, "Toshiba", "Satelite L50D-B-1CE", 649)
    );


    public static List<Artikel> getArtikels() {
        return new ArrayList<>(artikels);
    }

    private static Map<Integer, Artikel> artikelMap = new HashMap<>();

    static {
        artikels.stream().forEach(e -> artikelMap.put(e.getNummer(), e));
    }

    public static Artikel zoekArtikel(Integer nummer) {
        return artikelMap.get(nummer);
    }
}

