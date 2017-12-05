package be.kdg.streams;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;

/**
 * Werken met streams
 *   1. Maak een stream
 *   2. Specifieer 'intermediate operations'
 *   3. Specifieer een 'terminal operation'
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();

        /* Iteratief */
        int aantal = 0;
        for (Artikel artikel : artikels) {
            if (artikel.getPrijs() > 400.0) {
                aantal++;
            }
        }
        System.out.println(aantal);

        /* Met stream */
        long aantalArtikels = artikels.stream().filter(a -> a.getPrijs() > 400.0).count();
        System.out.println(aantalArtikels);
    }
}

/*
6
6
*/