package codering;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 28/09/16 16:21
 */
public class Codering {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        final int ASCII_SPATIE = 32;
        final int ASCII_Z_CAPS = 90;
        final int ASCII_B_CAPS = 26;
        String gedecodeerdBericht;
        String gecodeerdBericht = "";
        int verschuiving;
        int ascii;

        System.out.print("Geef een bericht: ");
        gedecodeerdBericht = keyboardScanner.nextLine();
        System.out.print("Hoeveel letters verschuiven: ");
        verschuiving = keyboardScanner.nextInt();

        //iedere letter in de string wordt omgezet naar ascii
        //daarna wordt asciiwaarde verschoven nav het aantal verschuivingen.
        //daarna naar terug naar een string.
        for (char karakter : gedecodeerdBericht.toCharArray()) {
            if ((int) karakter == ASCII_SPATIE) {
                gecodeerdBericht += " ";
            } else if ((int) karakter > ASCII_Z_CAPS - verschuiving) {
                ascii = (int) karakter - ASCII_B_CAPS + verschuiving;
                gecodeerdBericht += (char) ascii;
            } else {
                ascii = (int) karakter + verschuiving;
                gecodeerdBericht += (char) ascii;
            }
        }
        System.out.print("Gecodeerd bericht:");
        System.out.println(gecodeerdBericht);
        System.out.print("Gedecodeerd bericht:");
        System.out.println(gedecodeerdBericht);
    }
}