package be.kdg.kadotjes;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author Bryan de Ridder
 * @version 1.0 20/12/2016 14:05
 */
public class Main {
    public static void main(String[] args) {
        Persoon jarne = new Persoon("Jarne");
        Random r = new Random();
        jarne.voegGeschenkToe(new Geschenk("Bom", r.nextInt(10000)));
        jarne.voegGeschenkToe(new Geschenk("Pistool", 4));
        jarne.voegGeschenkToe(new Geschenk("Auto", 4));
        jarne.voegGeschenkToe(new Geschenk("Knuppel", r.nextInt(10000)));
        jarne.voegGeschenkToe(new Geschenk("Mes", r.nextInt(10000)));
        jarne.voegGeschenkToe(new Geschenk("Jacht", r.nextInt(10000)));
        jarne.voegGeschenkToe(new Geschenk("Vliegtuig", r.nextInt(10000)));
        jarne.voegGeschenkToe(new Geschenk("F1 Raceauto", r.nextInt(10000)));
        jarne.voegGeschenkToe(new Geschenk("Shirt", r.nextInt(10000)));
        jarne.voegGeschenkToe(new Geschenk("Bom", r.nextInt(10000)));

        jarne.toonGeschenken();
    }
}
