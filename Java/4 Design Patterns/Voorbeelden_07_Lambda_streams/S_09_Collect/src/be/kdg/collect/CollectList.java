package be.kdg.collect;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectList {
    public static void main(String[] args) {
        List<Integer> nummers = Arrays.asList(2, 6, 8);

        List<Artikel> specials =
             nummers.stream()
                    .map(Artikels::zoekArtikel)
                    .collect(Collectors.toList());
        specials.forEach(System.out::println);
    }
}

/*
  2 - Asus    - R556LA-XX1116H          - € 399,00
  6 - HP      - Pavilion 15-p268nb      - € 649,00
  8 - Toshiba - Satelite L50D-B-1CE     - € 649,00
*/
