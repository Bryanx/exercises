package be.kdg.foreach;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();
        List<Artikel> lijst = Arrays.asList(
                new Artikel(1, "Volvo", "S60", 35240),
                new Artikel(2, "Audi", "A4", 32800)
        );

        Consumer<Artikel> korting = e -> e.setPrijs(e.getPrijs() - 50);
        artikels.stream().forEach(korting);
        artikels.stream().forEach(System.out::println);
        System.out.println();

        lijst.stream().forEach(korting);
        lijst.stream().forEach(System.out::println);
    }
}

/*
  2 - Asus    - R556LA-XX1116H          - € 349,00
  6 - HP      - Pavilion 15-p268nb      - € 599,00
  7 - Asus    - EeeBook X205TA          - € 189,00
  1 - Lenovo  - IdeaPad G50-80          - € 499,00
  3 - Lenovo  - IdeaPad Z70-80          - € 449,00
 10 - Asus    - K555LJ-DM706T           - € 799,00
  9 - Lenovo  - IdeaPad S21e-20         - € 149,00
  5 - MSI     - GP72Qe-016BE            - €1149,00
  4 - Toshiba - Satelite Pro R50-B-109  - € 349,00
  8 - Toshiba - Satelite L50D-B-1CE     - € 599,00

  1 - Volvo   - S60                     - €35190,00
  2 - Audi    - A4                      - €32750,00
 */