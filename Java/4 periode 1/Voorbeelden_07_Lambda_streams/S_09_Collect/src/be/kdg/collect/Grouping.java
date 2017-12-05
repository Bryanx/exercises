package be.kdg.collect;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();

        Map<String, List<Artikel>> map = artikels
                .stream()
                .collect(Collectors.groupingBy(Artikel::getMerk));

        map.forEach((k, v) -> System.out.printf("%-8s %s\n", k, v.stream()
                                                                 .map(e -> e.getType() + " -> €" + e.getPrijs())
                                                                 .collect(Collectors.joining(", "))));
    }
}

/*
Lenovo   IdeaPad G50-80 -> €549.0, IdeaPad Z70-80 -> €499.0, IdeaPad S21e-20 -> €199.0
Toshiba  Satelite Pro R50-B-109 -> €399.0, Satelite L50D-B-1CE -> €649.0
MSI      GP72Qe-016BE -> €1199.0
HP       Pavilion 15-p268nb -> €649.0
Asus     R556LA-XX1116H -> €399.0, EeeBook X205TA -> €239.0, K555LJ-DM706T -> €849.0
 */