package peertutor;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 16:57
 */
public class Galgje2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String woord;
        String memory;
        char gok;
        int teller = 0;

        //woord invoeren
        do {
            System.out.print("Voer een woord in (5-10chars): ");
            woord = keyboard.nextLine();
            if (woord.length() < 5 || woord.length() > 10) {
                System.out.println("Geef een woord in het juist bereik.");
            }
        } while (woord.length() < 5 || woord.length() > 10);

        //20 lege regels
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

        StringBuilder woordBuilder = new StringBuilder();

        System.out.print("Het te zoeken woord: ");
        for (int i = 0; i < woord.length(); i++) {
            woordBuilder.append(".");
        }
        System.out.println(woordBuilder);

        for (int j = 1; j <= 8; j++) {

            System.out.print("Doe een gok (geef een letter): ");
            gok = keyboard.nextLine().charAt(0);

            //vervang puntjes voor letters
            for (int i = 0; i < woordBuilder.length(); i++) {
                if (gok == woord.charAt(i)) {
                    woordBuilder.setCharAt(i, gok);
                }
            }

            System.out.println(woordBuilder);

            if (woordBuilder.toString().equalsIgnoreCase(woord)) {
                System.out.print("Proficiat! Je hebt het woord geraden in: ");
                System.out.println(j + " keer raden.");
            }
        }
        System.out.print("Helaas, je hebt het woord niet binnen 8 beurten geraden.");

    }
}
