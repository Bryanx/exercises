package be.kdg.unaryoperator;

import be.kdg.data.Artikel;
import be.kdg.data.Artikels;

import java.util.List;

public class UnaryOperator {
    public static void main(String[] args) {
        List<Artikel> artikels = Artikels.getArtikels();
        // replaceAll heeft een parameter van het type UnaryOperator<T> operator
        artikels.replaceAll(a -> new Artikel(a.getNummer(), a.getMerk(), a.getType(), a.getPrijs() * 1.25));
        artikels.forEach(System.out::println);
    }
}

/*
  2 - Asus    - R556LA-XX1116H          - € 498,75
  6 - HP      - Pavilion 15-p268nb      - € 811,25
  7 - Asus    - EeeBook X205TA          - € 298,75
  1 - Lenovo  - IdeaPad G50-80          - € 686,25
  3 - Lenovo  - IdeaPad Z70-80          - € 623,75
 10 - Asus    - K555LJ-DM706T           - €1061,25
  9 - Lenovo  - IdeaPad S21e-20         - € 248,75
  5 - MSI     - GP72Qe-016BE            - €1498,75
  4 - Toshiba - Satelite Pro R50-B-109  - € 498,75
  8 - Toshiba - Satelite L50D-B-1CE     - € 811,25
 */