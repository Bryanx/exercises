import Domino.Spelbord;
import Domino.Speler;
import java.util.Scanner;

/**
 * Peer Tutoring
 * P2W5 - Collections
 */
public class DominoSpel {
    private static int MAXIMUM_AANTAL_SPELERS = 4;

    public static void main(String[] args) {
        System.out.println("Welkom bij het coolste dominospel ter wereld!!!");
        System.out.println("☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺");

        boolean geldigeInvoer = false;

        while (!geldigeInvoer) {
            System.out.print("Hoeveel spelers doen er mee (max. " + MAXIMUM_AANTAL_SPELERS + ")? ");
            Scanner ky = new Scanner(System.in);
            int ingegevenAantal = ky.nextInt();
            if (ingegevenAantal < 1)
                System.out.println("!!Gelieve min. 1 speler op te geven!!");
            else if (ingegevenAantal > MAXIMUM_AANTAL_SPELERS)
                System.out.println("!!Maxmium " + MAXIMUM_AANTAL_SPELERS + " spelers toegestaan!!");
            else {
                geldigeInvoer = true;
                Speler[] spelers = new Speler[ingegevenAantal];
                for (int i = 0; i < ingegevenAantal; i++) {
                    System.out.printf("Geef een naam voor speler %d: ", (i + 1));
                    String ingegevenNaam = ky.next();
                    spelers[i] = new Speler(ingegevenNaam);
                }
                speelSpel(spelers);
            }
        }
    }

    private static void speelSpel(Speler[] spelers) {
        Spelbord spel = new Spelbord(spelers);
        System.out.println("==> Status na het verdelen van de stenen");
        System.out.println(spel.getStatus());

        Speler gewonnenSpeler = null;
        int ronde = 1;
        do {
            System.out.println("** RONDE " + ronde + " **");
            gewonnenSpeler = spel.speelRonde();
            System.out.println(spel.getStatus());
            ronde++;
        } while (gewonnenSpeler == null);
        System.out.println("************ GEDAAN ************");
        System.out.println("Speler " + gewonnenSpeler.getNaam() + " is gewonnen!!");
        System.out.println(spel.getAfgelegdeStenen());

    }


}
