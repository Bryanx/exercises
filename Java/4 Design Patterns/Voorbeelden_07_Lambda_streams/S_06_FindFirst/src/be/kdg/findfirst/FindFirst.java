package be.kdg.findfirst;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirst {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();

        // Oude stijl
        /*
        Artikel artikel = artikels
                .stream()
                .filter(e -> e.getPrijs() < 500)
                .filter(e -> e.getMerk().equals("Lenovo"))
                .findFirst()
                .orElse(null);

        if (artikel != null) {
            System.out.println(artikel);
        }  else {
            System.out.println("Geen artikel gevonden!");
        }
        */

        // Beter
        // Zoek het eerste artikel van Lenovo goedkoper dan €500

        Optional<Artikel> artikel = artikels
                .stream()
                .filter(e -> e.getPrijs() < 500)
                .filter(e -> e.getMerk().equals("Lenovo"))
                .findFirst();
        if (artikel.isPresent()) {
            System.out.println(artikel.get());
        }  else {
            System.out.println("Geen artikel gevonden!");
        }
    }
}

/*
  3 - Lenovo  - IdeaPad Z70-80          - € 499,00
*/