import data.OptredenData;
import model.Optreden;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * Vervolledig de code volgens onderstaande instructies.
 * Vergelijk met de verwachte afdruk helemaal onderaan.
 */
public class DemoMap {
    public static void main(String[] args) {
        //TODO  1) Vervolledig de methode maakMap in de klasse OptredenData
        Map<String, List<Optreden>> optredenMap = OptredenData.maakMap();

        // TODO 2) Druk de gegevens af en controleer
        System.out.println("OVERZICHT per podium:");
        for (Map.Entry<String, List<Optreden>> e : optredenMap.entrySet()) {
            System.out.println(e.getKey()+":");
            for (Optreden o : e.getValue()) {
                System.out.println(o.toString());
            }
            System.out.println();
        }
    }
}

/*
Verwachte afdruk:
OVERZICHT per podium:

Main Stage:
Faithless (Main Stage, 14u30)--> *****
Editors (Main Stage, 16u)--> ****
Muse (Main Stage, 19u)--> *****
Pink (Main Stage, 20u30)--> **

Marquee:
The Specials (Marquee, 13u10)--> *****
Florence and the Machine (Marquee, 18u45)--> ***
Editors (Marquee, 21u20)--> ****

Pyramid Marquee:
Faithless (Pyramid Marquee, 19u)--> *****
Absynthe Minded (Pyramid Marquee, 21u45)--> *****
Empire of the Sun (Pyramid Marquee, 23u45)--> *****

*/