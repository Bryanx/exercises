package be.kdg.reduce;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;

public class CountDemo {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();

        // met reduce (sum)
        long aantalArtikels = artikels.stream()
                .mapToLong(e -> 1)
                .sum();
        System.out.println(aantalArtikels);

        // alternatief met count
        long aantal = artikels.stream().count();
        System.out.println(aantal);
    }
}

/*
10
10
 */