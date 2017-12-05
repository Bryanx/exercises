package be.kdg.consumer;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<Artikel> lijst = Artikels.getArtikels();

        Consumer<Artikel> print = a -> System.out.println(a);
        // Consumer<Artikel> print = System.out::println;
        lijst.forEach(print);

        System.out.println("\nToekennen korting 10%:\n");
        lijst.forEach(a -> a.setPrijs(a.getPrijs() * 0.9));
        lijst.forEach(System.out::println);
        // lijst.forEach(a -> System.out.println(a));
    }
}

/*
  2 - Asus    - R556LA-XX1116H          - € 399,00
  6 - HP      - Pavilion 15-p268nb      - € 649,00
  7 - Asus    - EeeBook X205TA          - € 239,00
  1 - Lenovo  - IdeaPad G50-80          - € 549,00
  3 - Lenovo  - IdeaPad Z70-80          - € 499,00
 10 - Asus    - K555LJ-DM706T           - € 849,00
  9 - Lenovo  - IdeaPad S21e-20         - € 199,00
  5 - MSI     - GP72Qe-016BE            - €1199,00
  4 - Toshiba - Satelite Pro R50-B-109  - € 399,00
  8 - Toshiba - Satelite L50D-B-1CE     - € 649,00

Toekennen korting 10%:

  2 - Asus    - R556LA-XX1116H          - € 359,10
  6 - HP      - Pavilion 15-p268nb      - € 584,10
  7 - Asus    - EeeBook X205TA          - € 215,10
  1 - Lenovo  - IdeaPad G50-80          - € 494,10
  3 - Lenovo  - IdeaPad Z70-80          - € 449,10
 10 - Asus    - K555LJ-DM706T           - € 764,10
  9 - Lenovo  - IdeaPad S21e-20         - € 179,10
  5 - MSI     - GP72Qe-016BE            - €1079,10
  4 - Toshiba - Satelite Pro R50-B-109  - € 359,10
  8 - Toshiba - Satelite L50D-B-1CE     - € 584,10
*/