package be.kdg;

import be.kdg.count.MyUtils;

import java.util.Arrays;
import java.util.List;

public class TestUtils {
    public static void main(String[] args) {
        String[] woordenReeks = {
                "Alfa", "Bravo", "Charlie", "Delta", "Echo", "Alfa", "Echo", "Echo"
        };

        List<String> woordenLijst = Arrays.asList(
                "Alfa", "Bravo", "Charlie", "Delta", "Echo", "Alfa", "Echo", "Echo"
        );

        Integer[] getallenReeks = { 1, 2, 3, 2, 3, 3, 1};
        List<Integer> getallenLijst = Arrays.asList(1, 2, 3, 2, 3, 3, 1);



        System.out.printf("Aantal keer %s in woordenReeks: %d\n", "Alfa", MyUtils.telFrequentie(woordenReeks, "Alfa"));
        System.out.printf("Aantal keer %s in woordenLijst: %d\n", "Echo", MyUtils.telFrequentie(woordenLijst, "Echo"));
        System.out.printf("Aantal keer %d in getallen8Reeks: %d\n", 2, MyUtils.telFrequentie(getallenReeks, 2));
        System.out.printf("Aantal keer %d in getallenLijst: %d\n", 3, MyUtils.telFrequentie(getallenLijst, 3));

        List<Persoon> personen = Arrays.asList(
                new Persoon("Sara", 24),
                new Persoon("Sara", 36),
                new Persoon("Paul", 24),
                new Persoon("Sara", 24)
        );

        Persoon persoon = new Persoon("Sara", 24);
        System.out.printf("Aantal keer '%s' in personen: %d\n", persoon, MyUtils.telFrequentie(personen, persoon));
    }
}

/*
Aantal keer Alfa in woordenReeks: 2
Aantal keer Echo in woordenLijst: 3
Aantal keer 2 in getallenReeks: 2
Aantal keer 3 in getallenLijst: 3
Aantal keer 'Sara 24' in personen: 2
 */
