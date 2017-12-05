package be.kdg.reduce;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;
import java.util.Optional;

public class SumDemo {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();

        Optional<Double> totaal = artikels.stream()
                .map(Artikel::getPrijs)
                .reduce((a, b) -> a + b);
        if (totaal.isPresent()) {
            System.out.println(totaal.get());
        }


        // alternatief
        double som = artikels.stream()
                .mapToDouble(Artikel::getPrijs)
                .sum();
        System.out.println(som);
    }
}

/*
5630.0
5630.0
 */