package be.kdg.predicate;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static <T> T firstMatch(List<T> candidates, Predicate<T> matchFunction) {
        for (T match : candidates) {
            if (matchFunction.test(match)) {
                return match;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Artikel> lijst = Artikels.getArtikels();

        System.out.println(firstMatch(lijst, a -> a.getPrijs() > 500));
        System.out.println(firstMatch(lijst, a -> a.getMerk().equals("Lenovo")));
        System.out.println(firstMatch(lijst, a -> a.getNummer() == 4));
    }
}

/*
  6 - HP      - Pavilion 15-p268nb      - €649,00
  1 - Lenovo  - IdeaPad G50-80          - €549,00
  4 - Toshiba - Satelite Pro R50-B-109  - €399,00
*/