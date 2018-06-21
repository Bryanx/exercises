package be.kdg.collect;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectString {
    public static void main(String[] args) {
        List<Integer> nummers = Arrays.asList(1, 3, 9, 4, 8);

        String types = nummers.stream()
                .map(Artikels::zoekArtikel)
                .map(Artikel::getType)
                .collect(Collectors.joining(", "));

        System.out.println(types);
    }
}

/*
IdeaPad G50-80, IdeaPad Z70-80, IdeaPad S21e-20, Satelite Pro R50-B-109, Satelite L50D-B-1CE
*/