package peertutor;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 16:34
 */
public class Galgje1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String woord;
        String gok = "";
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

        System.out.print("Het te zoeken woord: ");
        for (int i = 0; i < woord.length(); i++) {
            System.out.print(".");
        }
        System.out.println();

        System.out.print("Doe een gok: ");
        gok = keyboard.nextLine();

        for (teller = 0; !gok.equalsIgnoreCase(woord); teller++) {
            System.out.print("Fout! Doe een gok: ");
            gok = keyboard.nextLine();
        }
        System.out.print("Proficiat! Je hebt het woord geraden in: ");
        System.out.println(teller + " keer raden.");
    }
}
