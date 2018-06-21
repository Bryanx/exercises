package be.kdg.filter;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();

        // Geef alle artikels van het merk Asus die minder dan €500 kosten
        artikels
            .stream()
            .filter(e -> e.getPrijs() < 500)
            .filter(e -> e.getMerk().equals("Asus"))
            .forEach(System.out::println);
        System.out.println();

        // Geef alle artikels van het merk Asus in volgorde van oplopende prijs
        List<Artikel> asusLijst = artikels
            .stream()
            .filter(e -> e.getMerk().equals("Asus"))
            .sorted((a, b) -> Double.compare(a.getPrijs(), b.getPrijs()))
            .collect(Collectors.toList());
        asusLijst.forEach(System.out::println);
    }
}

/*
  2 - Asus    - R556LA-XX1116H          - € 399,00
  7 - Asus    - EeeBook X205TA          - € 239,00

  7 - Asus    - EeeBook X205TA          - € 239,00
  2 - Asus    - R556LA-XX1116H          - € 399,00
 10 - Asus    - K555LJ-DM706T           - € 849,00
 */