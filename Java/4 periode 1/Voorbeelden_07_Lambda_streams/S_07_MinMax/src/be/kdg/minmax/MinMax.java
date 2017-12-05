package be.kdg.minmax;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();

        // Druk het goedkoopste artikel af
        Artikel goedkoopste = artikels
                .stream()
                .min((a, b) -> Double.compare(a.getPrijs(), b.getPrijs()))
                .get();
        System.out.println(goedkoopste);

        // Druk het duurste artikel af indien er artikel aanwezig is
        artikels.stream()
                .max((a, b) -> Double.compare(a.getPrijs(), b.getPrijs()))
                .ifPresent(System.out::println);

        //berekent de som:
        Optional<Double> totaal = artikels.stream()
                .map(Artikel::getPrijs)
                .reduce((a, b) -> a + b);
        totaal.ifPresent(System.out::println);
    }
}

/*
  9 - Lenovo  - IdeaPad S21e-20         - € 199,00
  5 - MSI     - GP72Qe-016BE            - €1199,00
*/