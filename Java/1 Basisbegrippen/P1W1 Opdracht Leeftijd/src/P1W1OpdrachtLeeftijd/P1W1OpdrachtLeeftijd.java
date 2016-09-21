package P1W1OpdrachtLeeftijd;

import java.util.Scanner;

/**
 * @author Bryan de Ridder
 * @version 1.0 21/09/16 11:51
 */
public class P1W1OpdrachtLeeftijd {
    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);

        int geboortedatum;
        String naam;

        System.out.print("Hoe heet je?");
        naam = keyboardScanner.next();

        System.out.print("In welk jaar ben je geboren? ");
        geboortedatum = keyboardScanner.nextInt();

        int som = 2016-geboortedatum;

        System.out.println("Ok, "+naam+" je wordt dit jaar "+som);
    }
}