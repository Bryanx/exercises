import data.OptredenData;
import model.Optreden;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Vervolledig de code volgens onderstaande instructies.
 * Vergelijk met de verwachte afdruk helemaal onderaan.
 */

public class DemoSet {
    public static void main(String[] args) {
        //TODO  1) Vervolledig de methode maakSet in de klasse OptredenData
        Set<Optreden> optredenSet = OptredenData.maakSet();

        //TODO  2) Maak de set uniek op naam. Dus optredens met dezelfde naam worden geweerd.
        // Doe daarvoor de nodige aanpassingen in de klasse Optreden.
        // Controleer vervolgens de afdruk
        System.out.println("ZONDER DUBBELS EN ONGESORTEERD:");
        for (Optreden optreden : optredenSet) {
            System.out.println(optreden);
        }

        //TODO  3) Maak een nieuwe TreeSet op basis van de bestaande set.
        // Deze dient gesorteerd te zijn op naam. Doe dus ook aanpassingen in de klasse Optreden.
        // Controleer de afdruk.
        System.out.println("\nGESORTEERD op naam:");
        //TODO lus:
        for (Optreden o : new TreeSet<>(optredenSet)) {
            System.out.println(o);
        }

    }
}

/* Verwachte afdruk:
ZONDER DUBBELS EN ONGESORTEERD:
Absynthe Minded (Pyramid Marquee, 21u45)--> *****
Pink (Main Stage, 20u30)--> **
Florence and the Machine (Marquee, 18u45)--> ***
Editors (Main Stage, 16u)--> ****
The Specials (Marquee, 13u10)--> *****
Empire of the Sun (Pyramid Marquee, 23u45)--> *****
Muse (Main Stage, 19u)--> *****
Faithless (Main Stage, 14u30)--> *****

GESORTEERD op naam:
Absynthe Minded (Pyramid Marquee, 21u45)--> *****
Editors (Main Stage, 16u)--> ****
Empire of the Sun (Pyramid Marquee, 23u45)--> *****
Faithless (Main Stage, 14u30)--> *****
Florence and the Machine (Marquee, 18u45)--> ***
Muse (Main Stage, 19u)--> *****
Pink (Main Stage, 20u30)--> **
The Specials (Marquee, 13u10)--> *****
*/