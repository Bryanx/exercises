package Reeksen;

import java.util.Scanner;

/**
 * @author je naam
 * @version 1.0 22/09/2016 21:27
 */
public class Reeksen {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int aantal;
        int startwaarde;
        int verhoogwaarde;

        System.out.print("Hoeveel getallen wil je afdrukken? : ");
        aantal = keyboardScanner.nextInt()-1;  //-1 omdat startwaarde het eerste getal is
        System.out.print("Met welke waarde wil je starten? : ");
        startwaarde = keyboardScanner.nextInt();
        System.out.print("Met welke waarde wil je verhogen? : ");
        verhoogwaarde = keyboardScanner.nextInt();

        System.out.println(startwaarde);

        //bij iedere herhaling wordt de startwaarde verhoogd door zichzelf + verhoogwaarde
        //als het aantal herhalen op 0 komt stopt de herhaling.
        //bij iedere herhaling verminderd variabel aantal met 1
        while (aantal > 0) {
            startwaarde = startwaarde + verhoogwaarde;
            System.out.println(startwaarde);
            aantal--;
        }
    }
}
