package be.kdg.streams;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;

public class StreamSomPrijzen {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();

        double totaal = artikels.stream()
                .map(Artikel::getPrijs)
                .reduce((a, b) -> a + b)
                .get();
        System.out.println(totaal);
    }

}

/*
5630.0
 */