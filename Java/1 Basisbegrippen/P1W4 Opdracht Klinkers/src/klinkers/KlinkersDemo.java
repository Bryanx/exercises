package klinkers;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 12/10/16 13:49
 */
public class KlinkersDemo {
    public static void main(String[] args) {
        final String testWoord = "Gebruikershandleiding";
        Klinkers klinkers = new Klinkers(testWoord);

        klinkers.telKlinkers();

        System.out.println("Aantal klinkers in Gebruikershandleiding");
        System.out.println("a: " + klinkers.getA());
        System.out.println("e: " + klinkers.getE());
        System.out.println("i: " + klinkers.getI());
        System.out.println("o: " + klinkers.getO());
        System.out.println("u: " + klinkers.getU());

        klinkers.reset();

        Scanner keyboard = new Scanner(System.in);
        Boolean bool;
        String woord;

        System.out.println("Geef een woord (stop met onmiddellijk <Enter>): ");
        woord = keyboard.nextLine();


    }
}
