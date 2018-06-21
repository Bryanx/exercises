import data.OptredenData;
import model.Optreden;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *  Vervolledig de code volgens onderstaande instructies.
 * Vergelijk met de verwachte afdruk helemaal onderaan.
 */
public class DemoList {
    public static void main(String[] args) {
        // TODO 1) Vervolledig de methode maakList in de klasse OptredenData
        List<Optreden> optredenList = OptredenData.maakList();

        //TODO  2) Controleer de afdruk
        System.out.println("ONGESORTEERD:");
        for (Optreden optreden : optredenList) {
            System.out.println(optreden);
        }

        //TODO  3) Sorteer op sterren (asterisken). Pas daartoe de klasse Optreden aan
        Collections.sort(optredenList, new Comparator<Optreden>() {
            @Override
            public int compare(Optreden o1, Optreden o2) {
                return o2.getSterren() - o1.getSterren();
            }
        });

        // 4) Controleer de afdruk
        System.out.println("\nGESORTEERD op sterren:");
        for (Optreden optreden : optredenList) {
            System.out.println(optreden);
        }

        //TODO  5) Sorteer op naam. Gebruik een aparte Comparator-klasse
        Collections.sort(optredenList, new Comparator<Optreden>() {
            @Override
            public int compare(Optreden o1, Optreden o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        // TODO 6) Controleer de afdruk
        System.out.println("\nGESORTEERD op naam:");
        for (Optreden optreden : optredenList) {
            System.out.println(optreden);
        }
    }
}

/* Verwachte afdruk:
ONGESORTEERD:
Editors (Main Stage, 16u)--> ****
Empire of the Sun (Pyramid Marquee, 23u45)--> *****
Florence and the Machine (Marquee, 18u45)--> ***
The Specials (Marquee, 13u10)--> *****
Muse (Main Stage, 19u)--> *****
Faithless (Main Stage, 14u30)--> *****
Absynthe Minded (Pyramid Marquee, 21u45)--> *****
Pink (Main Stage, 20u30)--> **
Editors (Marquee, 21u20)--> ****
Faithless (Pyramid Marquee, 19u)--> *****

GESORTEERD op sterren:
Empire of the Sun (Pyramid Marquee, 23u45)--> *****
The Specials (Marquee, 13u10)--> *****
Muse (Main Stage, 19u)--> *****
Faithless (Main Stage, 14u30)--> *****
Absynthe Minded (Pyramid Marquee, 21u45)--> *****
Faithless (Pyramid Marquee, 19u)--> *****
Editors (Main Stage, 16u)--> ****
Editors (Marquee, 21u20)--> ****
Florence and the Machine (Marquee, 18u45)--> ***
Pink (Main Stage, 20u30)--> **

GESORTEERD op naam:
Absynthe Minded (Pyramid Marquee, 21u45)--> *****
Editors (Main Stage, 16u)--> ****
Editors (Marquee, 21u20)--> ****
Empire of the Sun (Pyramid Marquee, 23u45)--> *****
Faithless (Main Stage, 14u30)--> *****
Faithless (Pyramid Marquee, 19u)--> *****
Florence and the Machine (Marquee, 18u45)--> ***
Muse (Main Stage, 19u)--> *****
Pink (Main Stage, 20u30)--> **
The Specials (Marquee, 13u10)--> *****
*/