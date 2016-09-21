package P1W1OpdrachtLeeftijd;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/16 11:51
 */
public class P1W1OpdrachtLeeftijd {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int JAARTAL = 2016;
        int geboortedatum;
        String naam;

        System.out.print("Hoe heet je? ");
        naam = keyboardScanner.next();

        System.out.print("In welk jaar ben je geboren? ");
        geboortedatum = keyboardScanner.nextInt();

        int leeftijd = JAARTAL - geboortedatum;

        System.out.print("Ok " + naam);
        System.out.print(", u wordt dit jaar " + leeftijd);
        System.out.print(" jaar oud.");
    }
}