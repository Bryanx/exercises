package be.kdg.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 16:04
 */
public class Main {
    public static void main(String[] args) {
        Kleuterklas klas = new Kleuterklas("INF103B");
        klas.schrijfKindIn(new Kind("Jarne", 12, 1.60));
        klas.schrijfKindIn(new Kind("Joske", 11, 1.30));
        klas.schrijfKindIn(new Kind("Wouter", 10, 1.62));
        klas.schrijfKindIn(new Kind("Joren", 11, 1.30));
        klas.schrijfKindIn(new Kind("Michiel", 6, 1.10));

        klas.toonGemiddeldeLeeftijd();
        klas.toonKinderenGroterDanEenMeter();

        System.out.println(klas);
    }
}
