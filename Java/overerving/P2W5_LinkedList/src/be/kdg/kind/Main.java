package be.kdg.kind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Bryan de Ridder
 * @version 1.0 14/12/2016 11:02
 */
public class Main {
    public static void main(String[] args) {
        List<Kind> kinderen = new ArrayList<>();

        kinderen.add(new Kind("Klaas", 20, 1.80));
        kinderen.add(new Kind("Jan", 22, 1.70));
        kinderen.add(new Kind("Piet", 23, 1.60));
        kinderen.add(new Kind("Henk", 25, 1.90));

        Collections.sort(kinderen);
        System.out.println("Op lengte: ");
        for (Kind kind : kinderen) {
            System.out.println(kind);
        }

        //met innerklasse:
        Collections.sort(kinderen, new Comparator<Kind>() {
            @Override
            public int compare(Kind kind1, Kind kind2) {
                // kan ook:
                // Double.compare(kind1.getLengte(), kind2.getLengte());
                if (kind1.getLengte() > kind2.getLengte()) return -1;
                if (kind1.getLengte() > kind2.getLengte()) return 1;
                return 0;
            }
        });

        //met innerklasse:
        Collections.sort(kinderen, new Comparator<Kind>() {
            @Override
            public int compare(Kind kind1, Kind kind2) {
                return kind1.getLeeftijd() - kind2.getLeeftijd();
            }
        });

        System.out.println("\nOp leeftijd: ");
        for (Kind kind : kinderen) {
            System.out.println(kind);
        }
    }
}
