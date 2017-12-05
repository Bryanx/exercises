package be.kdg.map;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;
import java.util.Optional;

/**
 *          http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 */
public class Map {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();

        // Sorteer volgens nummer en verhoog met 21% BTW
        System.out.println("Gesorteerd volgens oplopend nummer:");
        artikels
                .stream()
                .map(e -> new Artikel(e.getNummer(), e.getMerk(), e.getType(), e.getPrijs() * 1.21))
                .sorted() // Volgens compareTo van klasse Artikel
                .forEach(System.out::println);
        System.out.println();

        // Sorteer volgens oplopende prijs
        System.out.println("Gesorteerd volgens oplopende prijs:");
        artikels
                .stream()
                .map(e -> new Artikel(e.getNummer(), e.getMerk(), e.getType(), e.getPrijs() * 1.21))
                .sorted( (a, b) -> Double.compare(a.getPrijs(), b.getPrijs()))
                .forEach(System.out::println);
        System.out.println();

        // Bepaal goedkoopste artikel en verhoog met 21% BTW
        Artikel goedkoopste = artikels
                .stream()
                .min( (a,b) -> Double.compare(a.getPrijs(), b.getPrijs()))
                .get();
        System.out.println("Goedkoopste: " + goedkoopste);

        // Bepaal de gemiddelde prijs van alle artikels
        double gemiddelde = artikels
                .stream()
                .mapToDouble(a -> a.getPrijs())
                .average()
                .getAsDouble();
        System.out.println("Gemiddelde prijs: " + gemiddelde);
    }
}

/*
Gesorteerd volgens oplopend nummer:
  1 - Lenovo  - IdeaPad G50-80          - € 664,29
  2 - Asus    - R556LA-XX1116H          - € 482,79
  3 - Lenovo  - IdeaPad Z70-80          - € 603,79
  4 - Toshiba - Satelite Pro R50-B-109  - € 482,79
  5 - MSI     - GP72Qe-016BE            - €1450,79
  6 - HP      - Pavilion 15-p268nb      - € 785,29
  7 - Asus    - EeeBook X205TA          - € 289,19
  8 - Toshiba - Satelite L50D-B-1CE     - € 785,29
  9 - Lenovo  - IdeaPad S21e-20         - € 240,79
 10 - Asus    - K555LJ-DM706T           - €1027,29

Gesorteerd volgens oplopende prijs:
  9 - Lenovo  - IdeaPad S21e-20         - € 240,79
  7 - Asus    - EeeBook X205TA          - € 289,19
  2 - Asus    - R556LA-XX1116H          - € 482,79
  4 - Toshiba - Satelite Pro R50-B-109  - € 482,79
  3 - Lenovo  - IdeaPad Z70-80          - € 603,79
  1 - Lenovo  - IdeaPad G50-80          - € 664,29
  6 - HP      - Pavilion 15-p268nb      - € 785,29
  8 - Toshiba - Satelite L50D-B-1CE     - € 785,29
 10 - Asus    - K555LJ-DM706T           - €1027,29
  5 - MSI     - GP72Qe-016BE            - €1450,79

Goedkoopste:   9 - Lenovo  - IdeaPad S21e-20         - € 199,00
Gemiddelde prijs: 563.0
*/