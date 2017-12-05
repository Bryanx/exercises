package be.kdg.reduce;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;
import java.util.OptionalDouble;

public class AverageDemo {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();

        OptionalDouble gemiddelde = artikels.stream()
                .mapToDouble(Artikel::getPrijs)
                .average();
        System.out.println(gemiddelde.getAsDouble());
    }
}

/*
563.0
 */