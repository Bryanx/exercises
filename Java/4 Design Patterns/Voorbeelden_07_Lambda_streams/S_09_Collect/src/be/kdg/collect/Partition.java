package be.kdg.collect;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partition {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();

        Map<Boolean, List<Artikel>> map = artikels
                .stream()
                .sorted()
                .collect(Collectors.partitioningBy(e -> e.getNummer() % 2 == 0));

        //  map.forEach((k, v) -> System.out.println(v));

        List<Artikel> even = map.get(true);
        List<Artikel> onEven = map.get(false);

        even.forEach(System.out::println);
        System.out.println();
        onEven.forEach(System.out::println);

    }
}

/*
  2 - Asus    - R556LA-XX1116H          - € 399,00
  4 - Toshiba - Satelite Pro R50-B-109  - € 399,00
  6 - HP      - Pavilion 15-p268nb      - € 649,00
  8 - Toshiba - Satelite L50D-B-1CE     - € 649,00
 10 - Asus    - K555LJ-DM706T           - € 849,00

  1 - Lenovo  - IdeaPad G50-80          - € 549,00
  3 - Lenovo  - IdeaPad Z70-80          - € 499,00
  5 - MSI     - GP72Qe-016BE            - €1199,00
  7 - Asus    - EeeBook X205TA          - € 239,00
  9 - Lenovo  - IdeaPad S21e-20         - € 199,00
 */